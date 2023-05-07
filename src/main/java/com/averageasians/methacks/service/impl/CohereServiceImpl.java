package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.entity.*;
import com.averageasians.methacks.entity.rerank.RerankInput;
import com.averageasians.methacks.entity.rerank.RerankOutput;
import com.averageasians.methacks.entity.rerank.RerankResult;
import com.averageasians.methacks.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CohereServiceImpl implements CohereService {

    WebClient webClient;
    private final String bearer = "y6X5xcFGAI1ywywYx8EBo1vZdkYNeUbF2Qy15DTq";

    PatientService patientService;
    ReportService reportService;
    LabResultService labResultService;
    DrugService drugService;
    ImmRecordService immRecordService;

    @Autowired
    public CohereServiceImpl(WebClient webClient,
                                PatientService patientService,
                                ReportService reportService,
                                LabResultService labResultService,
                                DrugService drugService,
                                ImmRecordService immRecordService) {
        this.webClient = webClient;
        this.patientService = patientService;
        this.reportService = reportService;
        this.labResultService = labResultService;
        this.drugService = drugService;
        this.immRecordService = immRecordService;
    }

    @Override
    public List<String> prepareDocuments(int patientId) {
        Optional<Patient> optionalPatient = patientService.getPatient(patientId);
        if (optionalPatient.isEmpty())
            return null;
        Patient patient = optionalPatient.get();

        List<String> documents = new ArrayList<>();
        patient.getReports().forEach(report -> documents.add(report.toString()));
        patient.getLabResults().forEach(labResult -> documents.add(labResult.toString()));
        patient.getDrugs().forEach(drug -> documents.add(drug.toString()));
        patient.getImmRecords().forEach(immRecord -> documents.add(immRecord.toString()));
        return documents;
    }

    @Override
    public RerankOutput rerank(RerankInput input) {
        RerankOutput response = webClient.post()
                .uri("rerank")
                .headers(h -> h.setBearerAuth(bearer))
                .body(Mono.just(input), RerankInput.class)
                .retrieve()
                .bodyToMono(RerankOutput.class)
                .block();
        assert response != null;
        return response;
    }

    @Override
    public List<Object> convertRankings(List<String> documents, RerankOutput output) {
        List<Object> results = new ArrayList<>();
        List<RerankResult> rerankResults = output.getResults();
        rerankResults.forEach(result -> {
            String document = documents.get(result.getIndex());
            if (document.startsWith("Report")) {
                Optional<Report> report = reportService.getReport(parseId(document, "Result".length() + 4));
                report.ifPresent(results::add);
            } else if (document.startsWith("LabResult")) {
                Optional<LabResult> labResult = labResultService.getLabResult(parseId(document, "LabResult".length() + 4));
                labResult.ifPresent(results::add);
            } else if (document.startsWith("Drug")) {
                Optional<Drug> drug = drugService.getDrug(parseId(document, "Drug".length() + 4));
                drug.ifPresent(results::add);
            } else if (document.startsWith("ImmRecord")) {
                Optional<ImmRecord> immRecord = immRecordService.getImmRecord(parseId(document, "ImmRecord".length() + 4));
                immRecord.ifPresent(results::add);
            }
        });
        return results;
    }

    private int parseId(String result, int startingIndex) {
        StringBuilder id = new StringBuilder();
        for (int i = startingIndex; i < result.length(); i++) {
            if (!Character.isDigit(result.charAt(i)))
                break;
            id.append(result.charAt(i));
        }
        return Integer.parseInt(id.toString());
    }
}

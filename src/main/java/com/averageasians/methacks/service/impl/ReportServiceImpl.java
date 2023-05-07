package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.ReportDAO;
import com.averageasians.methacks.entity.Report;
import com.averageasians.methacks.entity.summarize.SummarizeInput;
import com.averageasians.methacks.entity.summarize.SummarizeOutput;
import com.averageasians.methacks.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    ReportDAO reportDAO;
    WebClient webClient;
    public final String bearer = "y6X5xcFGAI1ywywYx8EBo1vZdkYNeUbF2Qy15DTq";

    @Autowired
    public ReportServiceImpl(ReportDAO reportDAO, WebClient webClient) {
        this.reportDAO = reportDAO;
        this.webClient = webClient;
    }

    @Override
    public List<Report> getReports() {
        return reportDAO.findAll();
    }

    @Override
    public Optional<Report> getReport(int id) { return reportDAO.findById(id); }

    @Override
    public void saveReport(Report report) { reportDAO.save(report); }

    @Override
    public void deleteReport(int id) {
        reportDAO.deleteById(id);
    }

    @Override
    public void summarize() {
        List<Report> reports = reportDAO.findAll();

        Iterator<Report> itr = reports.iterator();

        while (itr.hasNext()) {
            Report report = itr.next();

            // If there already exists a summary, do not do anything
            if (report.getReportSummary() != null) {
                continue;
            }

            // Else, create a summary of the report text and update the report entity
            String text = report.getReportText();
            SummarizeInput input = new SummarizeInput(text, "auto", "paragraph", "summarize-xlarge", "auto", 0.3, "");

            SummarizeOutput response = webClient.post()
                    .uri("/summarize")
                    .headers(h -> h.setBearerAuth(bearer))
                    .body(Mono.just(input), SummarizeInput.class)
                    .retrieve()
                    .bodyToMono(SummarizeOutput.class)
                    .block();
            assert response != null;

            report.setReportSummary(response.getSummary());

            reportDAO.save(report);
        }
    }

    @Override
    public String summarizeById(int id) {
        return reportDAO.findById(id).get().getReportSummary();
    }
}

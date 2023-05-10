package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.rerank.RerankInput;
import com.averageasians.methacks.entity.rerank.RerankOutput;

import java.util.List;

public interface CohereService {
    List<String> prepareDocuments(int patientId);
    RerankOutput rerank(RerankInput input);
    List<Object> convertRankings(List<String> documents, RerankOutput output);
}

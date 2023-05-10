package com.averageasians.methacks.entity.rerank;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RerankInput {
    private final String model = "rerank-english-v2.0";
    private String query;
    private List<String> documents;

    public RerankInput(String query) {
        this.query = query;
    }
}

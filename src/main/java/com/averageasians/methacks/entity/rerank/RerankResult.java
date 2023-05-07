package com.averageasians.methacks.entity.rerank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RerankResult {
    private int index;
    private double relevance_score;
}

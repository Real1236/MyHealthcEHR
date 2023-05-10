package com.averageasians.methacks.entity.rerank;

import com.averageasians.methacks.entity.meta.Meta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RerankOutput {
    private String id;
    private List<RerankResult> results;
    private Meta meta;
}

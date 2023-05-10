package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.rerank.RerankInput;
import com.averageasians.methacks.entity.rerank.RerankOutput;
import com.averageasians.methacks.service.CohereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cohere")
public class CohereController {

    CohereService cohereService;

    @Autowired
    public CohereController(CohereService cohereService) {
        this.cohereService = cohereService;
    }

    @PostMapping("/rerank/{id}")
    public List<Object> rerank(@RequestBody RerankInput input, @PathVariable(name = "id") Integer patientId) {
        input.setDocuments(cohereService.prepareDocuments(patientId));
        RerankOutput output = cohereService.rerank(input);
        return cohereService.convertRankings(input.getDocuments(), output);
    }
}

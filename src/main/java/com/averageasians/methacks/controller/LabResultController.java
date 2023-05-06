package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.LabResult;
import com.averageasians.methacks.service.LabResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("labResults")
public class LabResultController {

    LabResultService labResultService;

    @Autowired
    public LabResultController(LabResultService labResultService) {
        this.labResultService = labResultService;
    }

    @GetMapping
    public List<LabResult> getLabResults() {
        return labResultService.getLabResults();
    }

    @GetMapping("/{id}")
    public LabResult getLabResult(@PathVariable Integer id) {
        if (labResultService.getLabResult(id).isEmpty())
            return null;
        return labResultService.getLabResult(id).get();
    }

    @PostMapping
    public void saveLabResult(@RequestBody LabResult labResult) {
        labResultService.saveLabResult(labResult);
    }

    @DeleteMapping("/{id}")
    public void deleteLabResult(@PathVariable Integer id) {
        labResultService.deleteLabResult(id);
    }
}

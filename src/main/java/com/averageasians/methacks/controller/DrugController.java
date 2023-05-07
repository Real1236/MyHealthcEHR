package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.Drug;
import com.averageasians.methacks.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("drugs")
public class DrugController {

    DrugService drugService;

    @Autowired
    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }

    @GetMapping
    public List<Drug> getDrugs() {
        return drugService.getDrugs();
    }

    @GetMapping("/{id}")
    public Drug getDrug(@PathVariable Integer id) {
        if (drugService.getDrug(id).isEmpty())
            return null;
        return drugService.getDrug(id).get();
    }

    @PostMapping
    public void saveDrug(@RequestBody Drug drug) {
        drugService.saveDrug(drug);
    }

    @DeleteMapping("/{id}")
    public void deleteDrug(@PathVariable Integer id) {
        drugService.deleteDrug(id);
    }
}

package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.Drug;
import com.averageasians.methacks.entity.Patient;
import com.averageasians.methacks.service.DrugService;
import com.averageasians.methacks.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("drugs")
public class DrugController {

    DrugService drugService;
    PatientService patientService;

    @Autowired
    public DrugController(DrugService drugService, PatientService patientService) {
        this.drugService = drugService;
        this.patientService = patientService;
    }

    @GetMapping
    public List<Drug> getDrugs() {
        return drugService.getDrugs();
    }

    @GetMapping("/{id}")
    public List<Drug> getDrugs(@PathVariable(name = "id") Integer patientId) {
        Optional<Patient> patient = patientService.getPatient(patientId);
        return patient.map(Patient::getDrugs).orElse(null);
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

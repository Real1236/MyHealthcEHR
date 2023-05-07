package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.LabResult;
import com.averageasians.methacks.entity.Patient;
import com.averageasians.methacks.service.LabResultService;
import com.averageasians.methacks.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("labResults")
public class LabResultController {

    LabResultService labResultService;
    PatientService patientService;

    @Autowired
    public LabResultController(LabResultService labResultService, PatientService patientService) {
        this.labResultService = labResultService;
        this.patientService = patientService;
    }

    @GetMapping
    public List<LabResult> getLabResults() {
        return labResultService.getLabResults();
    }

    @GetMapping("/{id}")
    public List<LabResult> getLabResults(@PathVariable(name = "id") Integer patientId) {
        Optional<Patient> patient = patientService.getPatient(patientId);
        return patient.map(Patient::getLabResults).orElse(null);
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

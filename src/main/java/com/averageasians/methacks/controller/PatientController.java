package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.ImmRecord;
import com.averageasians.methacks.entity.Patient;
import com.averageasians.methacks.entity.Report;
import com.averageasians.methacks.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patients")
public class PatientController {

    PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Integer id) {
        if (patientService.getPatient(id).isEmpty())
            return null;
        return patientService.getPatient(id).get();
    }

    @PostMapping
    public void savePatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Integer id) {
        patientService.deletePatient(id);
    }

    @GetMapping("/reports/{id}")
    public List<Report> getReports(@PathVariable Integer id) {
        return patientService.getReports(id);
    }

    @GetMapping("/immRecords/{id}")
    public List<ImmRecord> getImmRecords(@PathVariable Integer id) {
        return patientService.getImmRecords(id);
    }
}

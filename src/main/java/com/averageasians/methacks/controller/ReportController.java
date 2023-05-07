package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.Patient;
import com.averageasians.methacks.entity.Report;
import com.averageasians.methacks.service.PatientService;
import com.averageasians.methacks.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("reports")
public class ReportController {

    ReportService reportService;
    PatientService patientService;

    @Autowired
    public ReportController(ReportService reportService, PatientService patientService) {
        this.reportService = reportService;
        this.patientService = patientService;
    }

    @GetMapping
    public List<Report> getReports() {
        return reportService.getReports();
    }

    @GetMapping("/{id}")
    public List<Report> getReports(@PathVariable(name = "id") Integer patientId) {
        Optional<Patient> patient = patientService.getPatient(patientId);
        return patient.map(Patient::getReports).orElse(null);
    }

    @PostMapping
    public void saveReport(@RequestBody Report report) {
        reportService.saveReport(report);
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Integer id) {
        reportService.deleteReport(id);
    }

    @GetMapping("/summarize")
    public void summarize(){ reportService.summarize(); }

    @GetMapping("/summarize/{id}")
    public String summarizeById(@PathVariable Integer id) { return reportService.summarizeById(id); }
}

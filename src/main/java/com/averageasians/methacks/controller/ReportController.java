package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.Report;
import com.averageasians.methacks.entity.summarize.SummarizeInput;
import com.averageasians.methacks.entity.summarize.SummarizeOutput;
import com.averageasians.methacks.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reports")
public class ReportController {

    ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    public List<Report> getReports() {
        return reportService.getReports();
    }

    @GetMapping("/{id}")
    public Report getReport(@PathVariable Integer id) {
        if (reportService.getReport(id).isEmpty())
            return null;
        return reportService.getReport(id).get();
    }

    @PostMapping
    public void saveReport(@RequestBody Report report) {
        reportService.saveReport(report);
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Integer id) {
        reportService.deleteReport(id);
    }

    @PostMapping("/summarize")
    public SummarizeOutput summarize(@RequestBody SummarizeInput input){
        return reportService.summarize(input);
    }
}

package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.Report;
import com.averageasians.methacks.entity.summarize.SummarizeInput;
import com.averageasians.methacks.entity.summarize.SummarizeOutput;

import java.util.List;
import java.util.Optional;

public interface ReportService {
    List<Report> getReports();
    Optional<Report> getReport(int id);
    void saveReport(Report report);
    void deleteReport(int id);
    void summarize();
    String summarizeById(int id);
}

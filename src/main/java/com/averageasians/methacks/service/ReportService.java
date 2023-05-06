package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.Report;

import java.util.List;
import java.util.Optional;

public interface ReportService {
    List<Report> getReports();
    Optional<Report> getReport(int id);
    void saveReport(Report report);
    void deleteReport(int id);
}

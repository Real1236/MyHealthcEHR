package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.ReportDAO;
import com.averageasians.methacks.entity.Report;
import com.averageasians.methacks.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    ReportDAO reportDAO;
    WebClient webClient;
    public final String bearer = "y6X5xcFGAI1ywywYx8EBo1vZdkYNeUbF2Qy15DTq";

    @Autowired
    public ReportServiceImpl(ReportDAO reportDAO, WebClient webClient) {
        this.reportDAO = reportDAO;
        this.webClient = webClient;
    }

    @Override
    public List<Report> getReports() {
        return reportDAO.findAll();
    }

    @Override
    public Optional<Report> getReport(int id) {
        return reportDAO.findById(id);
    }

    @Override
    public void saveReport(Report report) { reportDAO.save(report); }

    @Override
    public void deleteReport(int id) {
        reportDAO.deleteById(id);
    }
}
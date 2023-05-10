package com.averageasians.methacks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "report_date")
    private Date reportDate;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "report_text")
    private String reportText;

    @Column(name = "report_summary")
    private String reportSummary;

    @Column(name = "physician_id")
    private int physicianId;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "medications")
    private String medications;

    @Column(name = "procedures")
    private String procedures;

    @Column(name = "test_results")
    private String testResults;

    @Column(name = "allergies")
    private String allergies;

    @Column(name = "vital_signs")
    private String vitalSigns;

    @Column(name = "referral_info")
    private String referralInfo;
}

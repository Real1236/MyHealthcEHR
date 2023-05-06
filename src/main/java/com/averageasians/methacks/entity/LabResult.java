package com.averageasians.methacks.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lab_results")
public class LabResult {

    @Id
    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "wbc")
    private float whiteBloodCount;

    @Column(name = "rbc")
    private float redBloodCount;

    @Column(name = "hgb")
    private float hemoglobin;

    @Column(name = "hct")
    private float hematocrit;

    @Column(name = "platelet_count")
    private float plateletCount;

    @Column(name = "glucose")
    private float glucose;

    @Column(name = "sodium")
    private float sodium;

    @Column(name = "potassium")
    private float potassium;

    @Column(name = "chloride")
    private float chloride;

    @Column(name = "co2")
    private float co2;

    @Column(name = "calcium")
    private float calcium;

    @Column(name = "total_protein")
    private float total_protein;

    @Column(name = "albumin")
    private float albumin;

    @Column(name = "total_bilirubin")
    private float total_bilirubin;

    @Column(name = "alp")
    private float alp;

    @Column(name = "alt")
    private float alt;

    @Column(name = "ast")
    private float ast;

    @Column(name = "tsh")
    private float tsh;

    @Column(name = "total_cholesterol")
    private float total_cholesterol;

    @Column(name = "triglycerides")
    private float triglycerides;

    @Column(name = "hdl")
    private float hdl;

    @Column(name = "ldl")
    private float ldl;
}

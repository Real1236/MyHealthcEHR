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
@Table(name = "immunization_records")
public class ImmRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "immunization_name")
    private String immunizationName;

    @Column(name = "immunization_date")
    private Date immunizationDate;

    @Column(name = "immunization_site")
    private String immunizationSite;

    @Column(name = "immunization_dose")
    private String immunizationDose;

    @Column(name = "immunization_provider")
    private String immunizationProvider;

    @Column(name = "next_due_date")
    private Date nextDueDate;
}

package com.averageasians.methacks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "drugs")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "pharm_name")
    private String pharmName;

    @Column(name = "drug_name")
    private String drugName;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "drug_class")
    private String drugClass;

    @Column(name = "indications")
    private String indications;

    @Column(name = "dosage_form")
    private String dosageForm;

    @Column(name = "dosage_strength")
    private String dosageStrengths;

    @Column(name = "route_of_administration")
    private String routeOfAdministration;

    @Column(name = "mechanism_of_action")
    private String mechanismOfAction;
}

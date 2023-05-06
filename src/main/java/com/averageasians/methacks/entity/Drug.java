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
@Table(name = "drugs")
public class Drug {

    @Id
    @Column(name = "id")
    private int drugId;

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

    @Column(name = "dosage_strengths")
    private String dosageStrengths;

    @Column(name = "route_of_administration")
    private String routeOfAdministration;

    @Column(name = "mechanism_of_action")
    private String mechanismOfAction;
}

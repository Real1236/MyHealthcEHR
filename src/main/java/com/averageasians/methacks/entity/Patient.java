package com.averageasians.methacks.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "med_insurance")
    private String medInsurance;

    @Column(name = "vis_insurance")
    private String visInsurance;

    @Column(name = "den_insurance")
    private String denInsurance;

    @Column(name = "dob")
    private Date date;

    @Column(name = "sex")
    private char sex;

    @OneToMany(mappedBy = "patientId", cascade = CascadeType.ALL)
    private List<Report> reports = new ArrayList<>();

    @OneToMany(mappedBy = "patientId", cascade = CascadeType.ALL)
    private List<LabResult> labResults = new ArrayList<>();

    @OneToMany(mappedBy = "patientId", cascade = CascadeType.ALL)
    private List<Drug> drugs = new ArrayList<>();

    @OneToMany(mappedBy = "patientId", cascade = CascadeType.ALL)
    private List<ImmRecord> immRecords = new ArrayList<>();
}

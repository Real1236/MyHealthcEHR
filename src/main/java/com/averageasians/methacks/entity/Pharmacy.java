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
@Table(name = "pharmacies")
public class Pharmacy {

    @Id
    @Column(name = "pharmacy_id")
    private int pharmacyId;

    @Column(name = "pharmacy_name")
    private int pharmacy_name;

    @Column(name = "address")
    private int address;

    @Column(name = "phone_number")
    private int phone_number;

    @Column(name = "pharmacist_name")
    private int pharmacist_name;
}

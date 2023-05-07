package com.averageasians.methacks.dao;

import com.averageasians.methacks.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDAO extends JpaRepository<Patient, Integer> {
}

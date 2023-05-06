package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.Patient;
import com.averageasians.methacks.entity.Report;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> getPatients();
    Optional<Patient> getPatient(int id);
    void savePatient(Patient patient);
    void deletePatient(int id);
}

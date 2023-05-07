package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.*;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> getPatients();
    Optional<Patient> getPatient(int id);
    void savePatient(Patient patient);
    void deletePatient(int id);
    List<Report> getReports(int id);
    List<LabResult> getLabResults(int id);
    List<Drug> getDrugs(int id);
    List<ImmRecord> getImmRecords(int id);
}

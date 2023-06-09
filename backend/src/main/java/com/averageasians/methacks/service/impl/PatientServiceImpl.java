package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.PatientDAO;
import com.averageasians.methacks.entity.*;
import com.averageasians.methacks.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    PatientDAO patientDAO;

    @Autowired
    public PatientServiceImpl(PatientDAO patientDAO) {
        this.patientDAO = patientDAO;
    }

    @Override
    public List<Patient> getPatients() { return patientDAO.findAll(); }

    @Override
    public Optional<Patient> getPatient(int id) { return patientDAO.findById(id); }

    @Override
    public void savePatient(Patient patient) { patientDAO.save(patient);}

    @Override
    public void deletePatient(int id) { patientDAO.deleteById(id); }

    @Override
    public List<Report> getReports(int id) {
        if (getPatient(id).isEmpty())
            return null;
        return getPatient(id).get().getReports();
    }

    @Override
    public List<LabResult> getLabResults(int id) {
        if (getPatient(id).isEmpty())
            return null;
        return getPatient(id).get().getLabResults();
    }

    @Override
    public List<Drug> getDrugs(int id) {
        if (getPatient(id).isEmpty())
            return null;
        return getPatient(id).get().getDrugs();
    }

    @Override
    public List<ImmRecord> getImmRecords(int id) {
        if (getPatient(id).isEmpty())
            return null;
        return getPatient(id).get().getImmRecords();
    }
}

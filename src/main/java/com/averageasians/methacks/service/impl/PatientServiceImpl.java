package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.PatientDAO;
import com.averageasians.methacks.dao.ReportDAO;
import com.averageasians.methacks.entity.Patient;
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
}

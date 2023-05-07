package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.Drug;
import com.averageasians.methacks.entity.ImmRecord;
import com.averageasians.methacks.entity.Patient;
import com.averageasians.methacks.service.ImmRecordService;
import com.averageasians.methacks.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("immRecords")
public class ImmRecordController {

    ImmRecordService immRecordService;
    PatientService patientService;

    @Autowired
    public ImmRecordController(ImmRecordService immRecordService, PatientService patientService) {
        this.immRecordService = immRecordService;
        this.patientService = patientService;
    }

    @GetMapping
    public List<ImmRecord> getImmRecords() {
        return immRecordService.getImmRecords();
    }

    @GetMapping("/{id}")
    public List<ImmRecord> getImmRecords(@PathVariable(name = "id") Integer patientId) {
        Optional<Patient> patient = patientService.getPatient(patientId);
        return patient.map(Patient::getImmRecords).orElse(null);
    }

    @PostMapping
    public void saveImmRecord(@RequestBody ImmRecord immRecord) {
        immRecordService.saveImmRecord(immRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteImmRecord(@PathVariable Integer id) {
        immRecordService.deleteImmRecord(id);
    }
}

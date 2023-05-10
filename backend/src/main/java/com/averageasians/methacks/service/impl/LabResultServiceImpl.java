package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.LabResultDAO;
import com.averageasians.methacks.entity.LabResult;
import com.averageasians.methacks.service.LabResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LabResultServiceImpl implements LabResultService {

    LabResultDAO labResultDAO;

    @Autowired
    public LabResultServiceImpl(LabResultDAO labResultDAO) {
        this.labResultDAO = labResultDAO;
    }

    @Override
    public List<LabResult> getLabResults() {
        return labResultDAO.findAll();
    }

    @Override
    public Optional<LabResult> getLabResult(int id) {
        return labResultDAO.findById(id);
    }

    @Override
    public void saveLabResult(LabResult labResult) { labResultDAO.save(labResult); }

    @Override
    public void deleteLabResult(int id) {
        labResultDAO.deleteById(id);
    }
}

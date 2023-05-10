package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.DrugDAO;
import com.averageasians.methacks.dao.ReportDAO;
import com.averageasians.methacks.entity.Drug;
import com.averageasians.methacks.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrugServiceImpl implements DrugService {

    DrugDAO drugDAO;

    @Autowired
    public DrugServiceImpl(DrugDAO drugDAO) {
        this.drugDAO = drugDAO;
    }

    @Override
    public List<Drug> getDrugs() { return drugDAO.findAll(); }

    @Override
    public Optional<Drug> getDrug(int id) { return drugDAO.findById(id); }

    @Override
    public void saveDrug(Drug drug) { drugDAO.save(drug); }

    @Override
    public void deleteDrug(int id) { drugDAO.deleteById(id); }
}

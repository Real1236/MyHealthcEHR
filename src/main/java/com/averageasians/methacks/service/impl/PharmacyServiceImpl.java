package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.PharmDAO;
import com.averageasians.methacks.dao.ReportDAO;
import com.averageasians.methacks.entity.Pharmacy;
import com.averageasians.methacks.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    PharmDAO pharmDAO;

    @Autowired
    public PharmacyServiceImpl(PharmDAO pharmDAO) {
        this.pharmDAO = pharmDAO;
    }

    @Override
    public List<Pharmacy> getPharmacies() {
        return pharmDAO.findAll();
    }

    @Override
    public Optional<Pharmacy> getPharmacy(int id) {
        return pharmDAO.findById(id);
    }

    @Override
    public void savePharmacy(Pharmacy pharmacy) {
        pharmDAO.save(pharmacy);
    }

    @Override
    public void deletePharmacy(int id) {
        pharmDAO.deleteById(id);
    }
}

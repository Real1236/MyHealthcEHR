package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.Pharmacy;

import java.util.List;
import java.util.Optional;

public interface PharmacyService {
    List<Pharmacy> getPharmacies();
    Optional<Pharmacy> getPharmacy(int id);
    void savePharmacy(Pharmacy pharmacy);
    void deletePharmacy(int id);
}

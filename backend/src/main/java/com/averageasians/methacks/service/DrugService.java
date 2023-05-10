package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.Drug;

import java.util.List;
import java.util.Optional;

public interface DrugService {
    List<Drug> getDrugs();
    Optional<Drug> getDrug(int id);
    void saveDrug(Drug drug);
    void deleteDrug(int id);
}

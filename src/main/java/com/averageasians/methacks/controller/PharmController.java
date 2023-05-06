package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.Drug;
import com.averageasians.methacks.entity.Pharmacy;
import com.averageasians.methacks.service.DrugService;
import com.averageasians.methacks.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pharmacies")
public class PharmController {

    PharmacyService pharmacyService;

    @Autowired
    public PharmController(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping
    public List<Pharmacy> getPharmacies() {
        return pharmacyService.getPharmacies();
    }

    @GetMapping("/{id}")
    public Pharmacy getPharmacy(@PathVariable Integer id) {
        if (pharmacyService.getPharmacy(id).isEmpty())
            return null;
        return pharmacyService.getPharmacy(id).get();
    }

    @PostMapping
    public void savePharmacy(@RequestBody Pharmacy pharmacy) {
        pharmacyService.savePharmacy(pharmacy);
    }

    @DeleteMapping("/{id}")
    public void deletePharmacy(@PathVariable Integer id) {
        pharmacyService.deletePharmacy(id);
    }
}

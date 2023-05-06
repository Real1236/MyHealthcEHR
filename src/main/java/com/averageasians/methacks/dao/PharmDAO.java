package com.averageasians.methacks.dao;

import com.averageasians.methacks.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmDAO extends JpaRepository<Pharmacy, Integer> {
}

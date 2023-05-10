package com.averageasians.methacks.dao;

import com.averageasians.methacks.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugDAO extends JpaRepository<Drug, Integer> {
}

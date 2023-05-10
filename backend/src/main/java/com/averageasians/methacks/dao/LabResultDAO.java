package com.averageasians.methacks.dao;

import com.averageasians.methacks.entity.LabResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabResultDAO extends JpaRepository<LabResult, Integer> {
}

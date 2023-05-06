package com.averageasians.methacks.dao;

import com.averageasians.methacks.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportDAO extends JpaRepository<Report, Integer> {
}

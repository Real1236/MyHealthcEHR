package com.averageasians.methacks.dao;

import com.averageasians.methacks.entity.ImmRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmRecordDAO extends JpaRepository<ImmRecord, Integer> {
}

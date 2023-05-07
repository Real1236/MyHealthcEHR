package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.ImmRecord;

import java.util.List;
import java.util.Optional;

public interface ImmRecordService {
    List<ImmRecord> getImmRecords();
    Optional<ImmRecord> getImmRecord(int id);
    void saveImmRecord(ImmRecord immRecord);
    void deleteImmRecord(int id);
}

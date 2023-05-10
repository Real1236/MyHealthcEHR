package com.averageasians.methacks.service.impl;

import com.averageasians.methacks.dao.ImmRecordDAO;
import com.averageasians.methacks.entity.ImmRecord;
import com.averageasians.methacks.service.ImmRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImmRecordServiceImpl implements ImmRecordService {

    ImmRecordDAO immRecordDAO;

    @Autowired
    public ImmRecordServiceImpl(ImmRecordDAO immRecordDAO) {
        this.immRecordDAO = immRecordDAO;
    }

    @Override
    public List<ImmRecord> getImmRecords() {
        return immRecordDAO.findAll();
    }

    @Override
    public Optional<ImmRecord> getImmRecord(int id) {
        return immRecordDAO.findById(id);
    }

    @Override
    public void saveImmRecord(ImmRecord immRecord) {
        immRecordDAO.save(immRecord);
    }

    @Override
    public void deleteImmRecord(int id) {
        immRecordDAO.deleteById(id);
    }
}

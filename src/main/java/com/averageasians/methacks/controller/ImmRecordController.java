package com.averageasians.methacks.controller;

import com.averageasians.methacks.entity.ImmRecord;
import com.averageasians.methacks.service.ImmRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("immRecords")
public class ImmRecordController {

    ImmRecordService immRecordService;

    @Autowired
    public ImmRecordController(ImmRecordService immRecordService) {
        this.immRecordService = immRecordService;
    }

    @GetMapping
    public List<ImmRecord> getImmRecords() {
        return immRecordService.getImmRecords();
    }

    @GetMapping("/{id}")
    public ImmRecord getImmRecord(@PathVariable Integer id) {
        if (immRecordService.getImmRecord(id).isEmpty())
            return null;
        return immRecordService.getImmRecord(id).get();
    }

    @PostMapping
    public void saveImmRecord(@RequestBody ImmRecord immRecord) {
        immRecordService.saveImmRecord(immRecord);
    }

    @DeleteMapping("/{id}")
    public void deleteImmRecord(@PathVariable Integer id) {
        immRecordService.deleteImmRecord(id);
    }
}

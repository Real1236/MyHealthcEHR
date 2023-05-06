package com.averageasians.methacks.service;

import com.averageasians.methacks.entity.LabResult;

import java.util.List;
import java.util.Optional;

public interface LabResultService {
    List<LabResult> getLabResults();
    Optional<LabResult> getLabResult(int id);
    void saveLabResult(LabResult labResult);
    void deleteLabResult(int id);
}

package com.ecepolat.controller;

import com.ecepolat.dto.DtoEmployee;
import com.ecepolat.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}

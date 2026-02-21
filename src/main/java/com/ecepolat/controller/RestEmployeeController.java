package com.ecepolat.controller;

import com.ecepolat.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}

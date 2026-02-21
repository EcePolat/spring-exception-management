package com.ecepolat.service;

import com.ecepolat.dto.DtoEmployee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}

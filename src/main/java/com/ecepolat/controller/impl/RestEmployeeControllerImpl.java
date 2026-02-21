package com.ecepolat.controller.impl;

import com.ecepolat.controller.RestEmployeeController;
import com.ecepolat.dto.DtoEmployee;
import com.ecepolat.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl implements RestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
        return employeeService.findEmployeeById(id);
    }
}

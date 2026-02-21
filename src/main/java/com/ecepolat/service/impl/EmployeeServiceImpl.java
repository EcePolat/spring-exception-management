package com.ecepolat.service.impl;

import com.ecepolat.dto.DtoDepartment;
import com.ecepolat.dto.DtoEmployee;
import com.ecepolat.model.Department;
import com.ecepolat.model.Employee;
import com.ecepolat.repository.EmployeeRepository;
import com.ecepolat.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }

        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}

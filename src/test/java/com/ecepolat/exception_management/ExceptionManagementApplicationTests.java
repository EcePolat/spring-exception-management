package com.ecepolat.exception_management;

import com.ecepolat.dto.DtoEmployee;
import com.ecepolat.service.IEmployeeService;
import com.ecepolat.starter.ExceptionManagementStarter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach(){
		System.out.println("beforeEach çalıştı...");
	}

	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(2L);

		//assertNotNull(employee);

		if (employee!=null){
			System.out.println("isim : " + employee.getName());
		}
	}

	@AfterEach
	public void afterEach(){
		System.out.println("AfterEach çalıştı.");
	}

}

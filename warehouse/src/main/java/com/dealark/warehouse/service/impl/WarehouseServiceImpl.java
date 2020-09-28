package com.dealark.warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dealark.warehouse.entity.Employee;
import com.dealark.warehouse.repositories.EmployeeRepository;
import com.dealark.warehouse.service.WarehouseService_test;

public class WarehouseServiceImpl implements WarehouseService_test{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}

}

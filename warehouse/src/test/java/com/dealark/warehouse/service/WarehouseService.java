package com.dealark.warehouse.service;

import java.util.List;

import com.dealark.warehouse.entity.Employee;

public interface WarehouseService {
	
	List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee emp);
}

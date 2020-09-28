package com.dealark.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dealark.warehouse.entity.Employee;
import com.dealark.warehouse.service.WarehouseService;

@RestController
public class RestEndpoints {
	
	@Autowired
	private WarehouseService warehouseService;
	
	
	@RequestMapping(value="/employees")
	public List<Employee> getAllEmployees(){
		return warehouseService.getAllEmployees();
	}
	

}

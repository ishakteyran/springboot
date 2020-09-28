package com.dealark.warehouse.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dealark.warehouse.entity.Employee;

@Repository
@Qualifier(value="employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}

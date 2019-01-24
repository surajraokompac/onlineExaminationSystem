package com.dj.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import com.dj.domain.Employee;

public interface EmployeeService {
	boolean addEmployees(Employee employee);
	List<Employee> getList();
	boolean delete(Integer eid);
	List<Employee> edit(Employee employee);

}

package com.dj.dao;

import java.util.List;

import com.dj.domain.Employee;

public interface EmployeeDao {
	boolean addEmployees(Employee employee);

	List<Employee> getList();

	boolean delete(Integer eid);

	List<Employee> edit(Employee employee);
}

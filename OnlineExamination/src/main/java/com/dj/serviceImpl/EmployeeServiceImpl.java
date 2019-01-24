package com.dj.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.dao.EmployeeDao;
import com.dj.domain.Employee;
import com.dj.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	public boolean addEmployees(Employee employee) {
		return employeeDao.addEmployees(employee);
		
		
	}

	@Override
	public List<Employee> getList() {
		return employeeDao.getList();
	}

	@Override
	public boolean delete(Integer eid) {
		return employeeDao.delete(eid);
	}

	@Override
	public List<Employee> edit(Employee employee) {
		return employeeDao.edit(employee);
	}


}

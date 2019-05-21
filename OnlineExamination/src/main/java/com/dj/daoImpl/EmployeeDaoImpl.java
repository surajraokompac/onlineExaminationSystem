package com.dj.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dj.dao.EmployeeDao;
import com.dj.domain.Employee;


@Repository
public class EmployeeDaoImpl implements  EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;
	public boolean addEmployees(Employee employee) {
		Session openSession = sessionFactory.openSession();
		Transaction tx = openSession.beginTransaction();
		openSession.save(employee);
		tx.commit();
		openSession.close();
		return true;
	}
	@Override
	public List<Employee> getList() {
		Session openSession = sessionFactory.openSession();
		List<Employee> createQuery = openSession.createQuery("from com.dj.domain.Employee").list();
		for(Employee emp:createQuery) {
			System.out.println(emp);
		}
		openSession.close();
		
		return createQuery;
	}
	@Override
	public boolean delete(Integer eid) {
		System.out.println("suraj Divya id : "+eid);
		Session openSession = sessionFactory.openSession();
		Transaction tx = openSession.beginTransaction();
		Object o = openSession.load(Employee.class, eid);
		openSession.delete(o);
		tx.commit();
		openSession.close();
		return true;
	}
	@Override
	public List<Employee> edit(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}

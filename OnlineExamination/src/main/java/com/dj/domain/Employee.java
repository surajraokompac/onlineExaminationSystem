package com.dj.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="EmployeeTable")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EMP_SEQ_ADD")
	@SequenceGenerator(name="EMP_SEQ_ADD",initialValue=1,allocationSize=1,sequenceName="EMP_SEQ_ADD")
	private Integer eid;
	@NotEmpty(message="Name is Required")
	private String ename;
	private Double salary;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}

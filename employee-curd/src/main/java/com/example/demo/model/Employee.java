package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Long empId;
	private String fName;
	private String lName;
	private String phoneNo;
	private String empCity;
	private String empDept;
	private String empCountry;
	
	public Employee() {
		super();
	}

	public Employee(Long empId, String fName, String lName, String phoneNo, String empCity, String empDept,
			String empCountry) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.empCity = empCity;
		this.empDept = empDept;
		this.empCountry = empCountry;
	}

	public Employee(String fName, String lName, String phoneNo, String empCity, String empDept, String empCountry) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.empCity = empCity;
		this.empDept = empDept;
		this.empCountry = empCountry;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpCountry() {
		return empCountry;
	}

	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo
				+ ", empCity=" + empCity + ", empDept=" + empDept + ", empCountry=" + empCountry + "]";
	}
	
	
	

}

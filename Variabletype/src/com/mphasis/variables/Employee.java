package com.mphasis.variables;

public class Employee {
	
	static int eid;
	static String ename;
	static double salary;
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() { 
		return this.eid;
	}
	public String getEname() {
		return ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
}

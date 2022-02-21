package caseStudy;

public class Employee {
	private String Ename;
	private String Edept;
	private int Salary;
	
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEdept() {
		return Edept;
	}
	public void setEdept(String edept) {
		Edept = edept;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public Employee(String ename, String edept, int salary) {
		super();
		Ename = ename;
		Edept = edept;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ Ename=" + Ename + ", Edept=" + Edept + ", Salary=" + Salary + "]";
	}

}

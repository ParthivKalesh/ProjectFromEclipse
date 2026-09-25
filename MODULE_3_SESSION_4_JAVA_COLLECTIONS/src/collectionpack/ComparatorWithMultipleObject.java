package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Department{
	private int deptid;
	private String deptName;
	public Department(int deptif, String deptName) {
		super();
		this.deptid = deptif;
		this.deptName = deptName;
	}
	public int getDeptif() {
		return deptid;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
}

class Employeee {
	private int empid;
	private String empName;
	private double empSalary;
	private Department department;
	
	public Employeee(int empid, String empName, double empSalary, Department department) {
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public Department getDepartment() {
		return department;
	}
	
}

//==============Salary Comparator ============

class SalaryComparator implements Comparator<Employeee>{

	@Override
	public int compare(Employeee o1, Employeee o2) {
		
		return Double.compare(o1.getEmpSalary(), o2.getEmpSalary());
	}
	
}

//==============Department Comparator ============

class DepartmentComparator implements Comparator<Employeee>{

	@Override
	public int compare(Employeee o1, Employeee o2) {
		
		if(o1.getDepartment().getDeptName() == o2.getDepartment().getDeptName()) {
			return Double.compare(o1.getEmpSalary(), o2.getEmpSalary());
		}
		
		return o1.getDepartment().getDeptName().compareTo(o2.getDepartment().getDeptName());
	}
	
}

public class ComparatorWithMultipleObject {

	public static void main(String[] args) {
		
		Department d1 = new Department(9, "Computer Science");
		Department d2 = new Department(6, "Social Science");
		Department d3 = new Department(2, "English");
		Department d4 = new Department(2, "Botony");
		
		List<Employeee> ls = new ArrayList<Employeee>();
		ls.add(new Employeee(1, "hari", 12000, d4));
		ls.add(new Employeee(2, "anu", 34000, d3));
		ls.add(new Employeee(1, "jinu", 10000, d1));
		ls.add(new Employeee(1, "mari", 17000, d1));
		
		System.out.println("Salary omparator . . .");
		Collections.sort(ls, new SalaryComparator());
		for (Employeee emp : ls) {
			System.out.println(emp.getEmpName() + " " + emp.getEmpSalary() + " " + emp.getDepartment().getDeptName());
		}
		
		System.out.println("Salary omparator . . .");
		Collections.sort(ls, new DepartmentComparator());
		for (Employeee emp : ls) {
			System.out.println(emp.getEmpName() + " " + emp.getEmpSalary() + " " + emp.getDepartment().getDeptName());
		}
	}

}

package collectionpack;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Departments{
	private int deptid;
	private String deptName;
	public Departments(int deptif, String deptName) {
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

class Staff {
	private int empid;
	private String empName;
	private double empSalary;
	private Departments department;
	
	public Staff(int empid, String empName, double empSalary, Departments department) {
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

	public Departments getDepartment() {
		return department;
	}
	
}



public class UsingThenCompare {

	public static void main(String[] args) {
	
		Departments d1 = new Departments(9, "Computer Science");
		Departments d2 = new Departments(6, "Social Science");
		Departments d3 = new Departments(2, "English");
		Departments d4 = new Departments(2, "Botony");
		
		List<Staff> ls = new ArrayList<Staff>();
		ls.add(new Staff(1, "hari", 12000, d4));
		ls.add(new Staff(2, "anu", 34000, d3));
		ls.add(new Staff(1, "jinu", 10000, d1));
		ls.add(new Staff(1, "mari", 17000, d1));
		
		System.out.println("sort staff by department .. then salary");
		
		ls.sort(Comparator.comparing((Staff s)->s.getDepartment().getDeptName())
				.thenComparing(Comparator.comparing(Staff :: getEmpSalary).reversed()));
		
		for (Staff emp : ls) {
			System.out.println(emp.getEmpName() + " " + emp.getEmpSalary() + " " + emp.getDepartment().getDeptName());
		}
		
		
		
		System.out.println("Salary omparator . . .");
		
	}

}

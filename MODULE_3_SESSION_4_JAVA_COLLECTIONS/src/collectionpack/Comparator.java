package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//in old way we needed to downcast the object into employee obj

//public int compare(Object o1, Object o2) {
//	Employye e1 = (Employee) o1;
//	Employye e2 = (Employee) o2;
//	return e1.name.compareTo(e2.name);
//}

class Employee {
	int empno;
	String name;
	int age;

	Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements java.util.Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.age == e2.age)
			return 0;
		else if (e1.age > e2.age)
			return 1;
		else
			return -1;
	}

}

class NameComparator implements java.util.Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}

}

public class Comparator {

	public static void main(String[] args) {

		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(1, "parth", 29));
		ls.add(new Employee(2, "adhil", 34));
		ls.add(new Employee(3, "rincy", 17));
		ls.add(new Employee(4, "arya", 28));

		System.out.println("Age comparator . . .");
		Collections.sort(ls, new AgeComparator());
		for (Employee emp : ls) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}
		
		System.out.println("Name comparator . . .");
		Collections.sort(ls, new NameComparator());
		for (Employee emp : ls) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);
		}

	}

}

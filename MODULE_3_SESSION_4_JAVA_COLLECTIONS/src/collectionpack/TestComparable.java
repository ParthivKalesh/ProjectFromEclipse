package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Student implements Comparable<Student>{
	
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age){
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	}

	@Override
	public int compareTo(Student st) {
		if(rollno==st.rollno)
			return 0;
			else if(rollno>st.rollno)
			return 1;
			else
			return -1;
	}
}

public class TestComparable {

	public static void main(String[] args) {
		
		List<Student> sc = new ArrayList<Student>();
		sc.add(new Student(2,"Parth",22));
		sc.add(new Student(7,"sajan",52));
		sc.add(new Student(3,"Kalesh",42));
		sc.add(new Student(1,"renji",89));
		
		Collections.sort(sc);
		
		for(Student st:sc){
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}

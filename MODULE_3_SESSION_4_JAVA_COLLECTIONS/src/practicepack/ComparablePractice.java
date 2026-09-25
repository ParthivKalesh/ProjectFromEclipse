package practicepack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop> {
	int id;
	String brand;
	int ram;
	double price;
	
	public Laptop(int id, String brand, int ram, double price) {
		this.id = id;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {
		if(o.ram != this.ram) {
			return Integer.compare(o.ram,this.ram);
		}
		return Double.compare(o.price,this.price);
	}
	
}

public class ComparablePractice {

	public static void main(String[] args) {
		
		List<Laptop> lst = new ArrayList<Laptop>();
		lst.add(new Laptop(1, "hp", 8, 4000));
		lst.add(new Laptop(1, "lenovo", 16, 9000));
		lst.add(new Laptop(1, "dell",16, 6900));
		lst.add(new Laptop(1, "redmi", 4, 3400));
		
		Collections.sort(lst);
		for(Laptop list:lst) {
			System.out.println(list.brand);
		}

	}

}

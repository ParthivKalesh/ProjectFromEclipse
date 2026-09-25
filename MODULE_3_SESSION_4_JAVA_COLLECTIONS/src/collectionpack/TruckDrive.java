package collectionpack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Driver{
	String name;
	double experience;
	
	public Driver(String name, double experience) {
		this.name = name;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public double getExperience() {
		return experience;
	}
	
}

class Truck{
	String TruckName;
	double mileage;
	Driver driver;
	
	public Truck(String truckName, double mileage, Driver driver) {
		TruckName = truckName;
		this.mileage = mileage;
		this.driver = driver;
	}

	public String getTruckName() {
		return TruckName;
	}

	public double getMileage() {
		return mileage;
	}

	public Driver getDriver() {
		return driver;
	}
	
}


public class TruckDrive {

	public static void main(String[] args) {
	
		Driver dr1 = new Driver("Parthiv", 7);
		Driver dr2 = new Driver("anu", 5);
		Driver dr3 = new Driver("siya", 18);
		
		List<Truck> list = new ArrayList<Truck>();
		list.add(new Truck("maari", 12, dr3));
		list.add(new Truck("jaavan", 8, dr2));
		list.add(new Truck("onu", 9, dr1));
		
		list.sort(Comparator.comparing((Truck s)->s.getDriver().getExperience()).reversed()
				.thenComparing(Comparator.comparing(Truck :: getMileage).reversed()));
		
		for (Truck emp : list) {
			System.out.println(emp.getTruckName() + " " + emp.getMileage() + " " + emp.getDriver().getExperience());
		}
		

	}

}

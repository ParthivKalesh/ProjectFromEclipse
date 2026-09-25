package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionMethodDemo {

	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("java");
	list.add("jsp");
	list.add("java");
	list.add("JAVA");
	list.add(3,"Spring");
	System.out.println("List : "+list);
	System.out.println("elementat index 3 :"+list.get(3));
	list.remove("java");
	System.out.println("After removing 'java' :"+list);
	
	System.out.println("Contains jsp ?"+list.contains("jsp"));
	
	Collections.sort(list);
	System.out.println("Sorted list :"+list);
	Collections.reverse(list);
	
	Set<String> set = new HashSet<String>();
	set.add("java");
	set.add("Spring");
	set.add("jsp");
	set.add("java");
	System.out.println("\nSet :"+set);
	
	
	
	
	Map<Integer,String> map = new HashMap<Integer, String>();
	map.put(101,"Java");
	map.put(102, "Python");
	map.put(103, "C++");
	map.put(104, "Kotlin");
	System.out.println("\nMap :"+map);
	
	System.out.println("after removing key 103:"+map.get(102));
	map.remove(103);
	System.out.println(map.keySet());
	System.out.println(map.values());
	
	
	
	}
	

	

}

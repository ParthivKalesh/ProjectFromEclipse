package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ForEachMImmutable {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("java");
		ls.add("Luminar");
		System.out.println(ls);
		
		for(String s: ls){
           s+="kochi";
        }
		System.out.println(ls);
		
		System.out.println("----------------");
		
		List<StringBuilder> ls1 = new ArrayList<StringBuilder>();
		ls1.add(new StringBuilder("python"));
		ls1.add(new StringBuilder("flutter"));
		ls1.add(new StringBuilder("javascript"));
         System.out.println(ls1);
		
		for(StringBuilder sb: ls1){
           sb.append("kochi");
        }
		System.out.println(ls1);

	}

}

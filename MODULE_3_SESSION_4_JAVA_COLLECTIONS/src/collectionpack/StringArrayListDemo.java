package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringArrayListDemo {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("java");
		ls.add("Spring Boot");
		ls.add("React");
		
		Iterator<String> names = ls.iterator();
        while(names.hasNext()) {
        	String num = names.next();
        	System.out.println(num);
        }
        System.out.println("---------------------");
        List<String> ls1 = new ArrayList<String>();
		ls1.add("Android");
		ls1.add("Kotlin");
		ls1.add("Flutter");
        ls.addAll(1,ls1);
        System.out.println(ls.contains("Flutter"));
        ls.removeIf(data->data.endsWith("n"));
        System.out.println(ls);

	}

}

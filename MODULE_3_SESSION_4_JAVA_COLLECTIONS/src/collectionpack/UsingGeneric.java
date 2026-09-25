package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingGeneric {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("java");
		ls.add("Luminar");
		//ls.add(10);
		//ls.add(new Integer(1234);
		//Integer intObj = ls.get(0);
		System.out.println(ls);
		
		Iterator<String> iterator = ls.iterator();

		  while(iterator.hasNext()){
             if(iterator.next().equals("hibernate")){
                 iterator.remove();
             }
         }

	}

}

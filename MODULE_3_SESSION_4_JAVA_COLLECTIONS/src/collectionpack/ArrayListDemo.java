package collectionpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
       // list.add("Hello");
        
//        for(int li:list) {
//        	System.out.println(li);
//        }
        
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
        	int num = itr.next();
        	System.out.println(num);
        }

    }
}

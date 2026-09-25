package collectionpack;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		int id;
		String name;
		boolean isItreation = true;
		char choice;
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		 do {
			 System.out.println("Enter the id");
			 id = sc.nextInt();
			 
			 System.out.println("Enter the name");
			 name = sc.next();
			 
			 hs.put(id, name);
			 
			 System.out.println("Do you wanted add another student ?(y/n)");
			 
			 choice = sc.next().charAt(0);
			 
			 if(choice == 'y') {
				 continue;
			 }else {
				 break;
			 }
		 }while(isItreation);
		 
		 for(int key:hs.keySet()) {
			  System.out.println("Key: " + key + ", Value: " + hs.get(key));
		 }
	}

}

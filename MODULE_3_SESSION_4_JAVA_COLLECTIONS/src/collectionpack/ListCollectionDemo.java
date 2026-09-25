package collectionpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListCollectionDemo {

	public static void main(String[] args) {
		List<Integer> listArray = new ArrayList<Integer>();
		List<Integer> listLinked = new LinkedList<Integer>();
		List<Integer> listVector = new Vector<Integer>();
		List<Integer> listStack = new Vector<Integer>();
		
		listArray.add(10);
		listArray.add(20);
		
		listLinked.add(30);
		listLinked.add(40);
		
		listVector.add(50);
		listVector.add(60);
		
		listStack.add(70);
		listStack.add(80);
		
		for(int num:listArray) {
			System.out.println(num);
		}
		for(int num:listLinked) {
			System.out.println(num);
		}
		for(int num:listVector) {
			System.out.println(num);
		}
		for(int num:listStack) {
			System.out.println(num);
		}
	}

}

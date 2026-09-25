package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProblrm {

	public static void main(String[] args) {
		List<String> courses = new ArrayList<>();
        courses.add("T");
        courses.add("A");
        courses.add("M");
        
        Collections.sort(courses); 
        System.out.println(courses);

	}

}

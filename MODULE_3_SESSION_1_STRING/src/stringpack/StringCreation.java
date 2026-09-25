package stringpack;

public class StringCreation {

	public static void main(String[] args) {
		//Literal way - String constant pool
		String s = "Hello";
		//using new keyword - Heap memory
		String s1 = new String("java");
		s=s.concat("friends");
		System.out.println(s);
		

	}

}

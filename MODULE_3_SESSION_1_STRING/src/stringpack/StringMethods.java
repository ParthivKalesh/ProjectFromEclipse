package stringpack;

public class StringMethods {

	public static void main(String[] args) {
		String name = "parthi";
		String name1 = new String("parthi");
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(3));
		System.out.println(name.compareTo(name1));
		System.out.println(name1.compareTo(name));
		System.out.println(name1.equals(name));
	}

}

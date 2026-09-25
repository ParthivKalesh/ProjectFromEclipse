package exceptionpack;

public class ThrowDemo {
	
	static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("age is not valid");
		}else {
			System.out.println("ok");
		}
	}

	public static void main(String[] args) {
		try {
		checkAge(9);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

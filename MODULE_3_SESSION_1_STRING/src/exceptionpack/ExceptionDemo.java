package exceptionpack;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
		int result = 50/0;
		System.out.println("Result = "+result);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		

	}

}

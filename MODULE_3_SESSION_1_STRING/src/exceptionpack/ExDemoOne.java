package exceptionpack;

public class ExDemoOne {

	public static void main(String[] args) {
		
		try {
			try {
		int result = 10/0;
		System.out.println(result);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
		try {
		int [] arr = {12,3,5,6};
		System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Thank U");

	}

}

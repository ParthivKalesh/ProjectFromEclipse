package exceptionpack;

import java.util.Scanner;

public class ExpProblem {
	
	static int div(int n1,int n2) {
		int num;
		if(n1 == 0 || n2 ==0) {
			throw new ArithmeticException("Zero not be allowed");
		}else {
		    num = n1/n2;
		}
		return num;
	}
    
	
	public static void main(String[] args) {
		int[] arr = new int[3];
		int num1,num2;
		int result;
		int index;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		try {
		 result = div(num1,num2);
		 System.out.println("enter the index value store the result");
		 index = sc.nextInt();
		 if(index > arr.length-1) {
			 throw new IndexOutOfBoundsException("limit exceed");
		 }else {
		 arr[index] = result;
		 }
		 
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("kazhinjitilla rama ...7");
		}

	}

}

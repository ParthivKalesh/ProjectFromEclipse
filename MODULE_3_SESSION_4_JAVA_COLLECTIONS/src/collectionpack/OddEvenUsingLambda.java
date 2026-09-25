package collectionpack;


import java.util.Scanner;

interface SUS{
	boolean check(int a);
}

public class OddEvenUsingLambda {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		SUS obj = (a) -> a%2 == 0;
		if(obj.check(num)) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}

}

package stringpack;

import java.util.Scanner;

public class CountNumberOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String Str = sc.nextLine();
		String[] StrArray = Str.trim().split(" ");
		System.out.println(StrArray.length);
			
		}

	}



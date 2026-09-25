package collectionpack;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Books{
	String bookName;
	String authorName;
	float bookPrice;

	public Books(String bookName, String authorName, float bookPrice) {
	this.bookName = bookName;
	this.authorName = authorName;
	this.bookPrice = bookPrice;
	}
}

public class HashBooks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bookId;
		String bookName;
		String authorName;
		float bookPrice;

		char choice;

		Map<Integer, Books> map = new Hashtable<Integer, Books>();
		
		do {
			System.out.print("Enter Book Id");
			bookId = scan.nextInt();
			
			scan.nextLine();
			
			System.out.print("Enter Book Name:");
			bookName = scan.nextLine();
			
			System.out.print("Enter Author Name:");
			authorName = scan.nextLine();

			System.out.print("Enter Book Price");
			bookPrice = scan.nextFloat();
			
			map.put(bookId,new Books(bookName, authorName, bookPrice));
			
			System.out.print("Enter another book (y/n)?");
			choice = scan.next().charAt(0);

			
			if ((choice == 'y') || (choice == 'Y')) {
			continue;
			} else {
			break;
			}
		}while(true);
		
		for(Map.Entry<Integer,Books> entry : map.entrySet()) {
			int key = entry.getKey();
			Books value = entry.getValue();
			
			System.out.println("Details :"+key);
			System.out.println("Book Name:"+value.bookName);
			System.out.println("Book Author:"+value.authorName);
			System.out.println("Book Price:"+value.bookPrice);
		}

	}

}

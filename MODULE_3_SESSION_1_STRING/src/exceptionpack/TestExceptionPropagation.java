package exceptionpack;

public class TestExceptionPropagation {
	
	void display() {
		int data = 50/0;
		System.out.println(data);
	}
	void print() {
		display();
	}
	void test() {
		try {
			print();
		}catch(Exception e) {
			System.out.println("exception handler");
		}
	}
	public static void main(String[] args) {
		TestExceptionPropagation sc = new TestExceptionPropagation();
		sc.test();
		System.out.println("normal flow");
	}
}

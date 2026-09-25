package collectionpack;

interface Demo{  //functional interface
	int show(int a,int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		//override method using anonymous inner class
//		Demo obj = new Demo() {
//			@Override
//			public void show() {	
//				
//			}
//		};
		
		//using lambda
//		Demo sc = ()->System.out.println("show method");
//		sc.show();
		
		Demo obj = (a,b) -> a+b;
		System.out.println(obj.show(100, 30));
		
	}

}

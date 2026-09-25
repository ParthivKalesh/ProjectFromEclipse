package threadpack;

class CustomerRes extends Thread{
	String item;
	
	public CustomerRes(String item) {
		this.item = item;
	}

	@Override
	public void run() {
		System.out.println("I wanted to order :"+item);
	}
}
//======================end of Customer thread========
class Waiter extends Thread{
	String item;
	public Waiter(String item) {
		this.item = item;
	}
	@Override
	public void run() {
		System.out.println("Waiter recieved the order: "+item);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("waiter : order "+item+" given to chef");
	}
	
}

class Chef extends Thread{
	String item;
	public Chef(String item) {
		this.item = item;
	}
	@Override
	public void run() {
		System.out.println("preparing the order : "+item);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("order :"+item+" is ready to serve");
	}
}

public class RestaurantDemo {

	public static void main(String[] args) throws InterruptedException {
		String[] orders = {"Biriyani","Mandhi","Kebab"};
		
		for(String order:orders) {
			CustomerRes cus1 = new CustomerRes(order);
			Waiter waiter = new Waiter(order);
			Chef chef = new Chef(order);
			
			cus1.start();
			cus1.join();
			waiter.start();
			waiter.join();
			chef.start();
			chef.join();
		}
		
		
		

	}

}

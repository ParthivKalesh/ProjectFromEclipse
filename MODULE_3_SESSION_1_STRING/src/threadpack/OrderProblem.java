package threadpack;

class Order{
	static int orderId = 1000;
	
	synchronized static void orderBuild(String name,long phNo) {
		orderId++;
		System.out.println("Order is place for :"+name+" order id :"+orderId);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Customer extends Thread{
	
	String name;
	long phnum;
	
	public Customer(String name, long phnum) {
		this.name = name;
		this.phnum = phnum;
	}
	@Override
	public void run() {
		Order.orderBuild(name,phnum);
	}
}
public class OrderProblem {

	public static void main(String[] args) {
		Customer c1 = new Customer("parthiv",82379);
		Customer c2 = new Customer("sanju",278379);
		Customer c3 = new Customer("sajan",25377);
		
		c1.start();
		c2.start();
		c3.start();
	}

}

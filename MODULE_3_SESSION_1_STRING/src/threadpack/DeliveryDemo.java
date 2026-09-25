package threadpack;

class DeliveryBoy implements Runnable{
	private String order;
	
	public DeliveryBoy(String order) {
		this.order = order;
	}

	@Override
	public void run() {
		
		try {
			for(int i = 1;i<= 5;i++) {
				System.out.println("Delivering the order :"+i+"KM is reached");
				Thread.sleep(1000);
				}
			System.out.println("order completed :"+order);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
}

public class DeliveryDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread customer1 = new Thread(new DeliveryBoy("Al-reem Mandi"));
		Thread customer2 = new Thread(new DeliveryBoy("Pizza"));
		customer1.start();
		customer1.join();
		customer2.start();
		System.out.println("customer 2 is cancelled");
		customer2.interrupt();
		customer2.join();
	}

}

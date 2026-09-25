package threadpack;

class Lulu{
	static int billNumber = 1000;
	synchronized static void generateBill(String counter) {
		billNumber++;
		System.out.println(counter+"bill generated :"+billNumber);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Counter extends Thread{
	String name;
	
	public Counter(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		Lulu.generateBill(name);
	}
	
}

public class SuperMarket {

	public static void main(String[] args) {
		
		Counter c1 = new Counter("counter1");
		Counter c2 = new Counter("counter2");
		c1.start();
		c2.start();
	}

}

package threadpack;


class CustomerClient{
	double balanceAmount =10000;
	
	synchronized void withdraw(double amount) {
		System.out.println("going to withdraw ...");
		if(amount > balanceAmount) {
			System.out.println("balance is less,waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balanceAmount = balanceAmount-amount;
			System.out.println("withdrwal completed");
		}
	}
	
	synchronized void deposit(double amount) {
		System.out.println("going to deposit ..");
		balanceAmount = balanceAmount+amount;
		System.out.println("amount deposited");
		notify();
	}
	
}

public class Bank {

	public static void main(String[] args) {
		
		CustomerClient cu = new CustomerClient();
		
		new Thread() {
			public void run() {
				cu.withdraw(12000);
			};
		}.start();
		
		new Thread() {
			public void run() {
				cu.deposit(3000);
			};
		}.start();
	}

}

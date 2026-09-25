package threadpack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Banking implements Runnable{
	private String customerName;
    private String transactionType;
    
	public Banking(String customerName, String transactionType) {
		this.customerName = customerName;
		this.transactionType = transactionType;
	}


	@Override
	public void run() {
		System.out.println("processing "+transactionType+"for"+customerName+"\n"+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("completed "+transactionType+" for "+customerName+"\n"+Thread.currentThread().getName());

	}
}

public class BankTransaction {
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Banking("parthiv", "withdrwal"));
		executorService.execute(new Banking("sajan", "deposit"));
		executorService.execute(new Banking("sanju", "bal enq"));
		executorService.execute(new Banking("gedi", "withdrwal"));
		
		executorService.shutdown();
	}
}

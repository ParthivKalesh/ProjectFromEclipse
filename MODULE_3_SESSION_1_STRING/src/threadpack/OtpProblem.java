package threadpack;

import java.util.Random;

class Otp {
	static Random random = new Random();
	
	 synchronized static void otpGenerate(long mobileNum) {
		 int otpNumber = 10000 + random.nextInt(90000);
		 System.out.println(otpNumber+" otp number generate for :"+mobileNum);
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	
}

class Client extends Thread{
	long mobNumber;

	public Client(long mobNumber) {
		this.mobNumber = mobNumber;
	}
	@Override
	public void run() {
		Otp.otpGenerate(mobNumber);
	}
}

public class OtpProblem {

	public static void main(String[] args) {
		Client client1 = new Client(98562823);
		client1.start();
		
		Client client2 = new Client(78562820);
		client2.start();
		
		Client client3 = new Client(88562826);
		client3.start();
	}

}

package threadpack;

class YellowSignal extends Thread{
	@Override
	public void run() {
		System.out.println("signal shows yellow");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("vehicle slow down.....");
	}
}
class RedSignal extends Thread{
	@Override
	public void run() {
		System.out.println("signal shows red");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("vehicle is stopped.....");
	}
}
class GreenSignal extends Thread{
	@Override
	public void run() {
		System.out.println("signal shows green");
		for(int i = 1; i < 10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("i am driving.....");
	}
}

public class ThreadPro {

	public static void main(String[] args) {
		
		GreenSignal gSignal = new GreenSignal();
		gSignal.start();
		try {
			gSignal.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		YellowSignal sc = new YellowSignal();
		sc.start();
		
		RedSignal sc1 = new RedSignal();
		sc1.start();
		

	}

}

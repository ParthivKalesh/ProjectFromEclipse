package threadpack;

public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println("this code is running in a tread :"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadDemo sc = new ThreadDemo();
		ThreadDemo sc1 = new ThreadDemo();
		sc.setPriority(5); 
		sc1.setPriority(1);
		sc.start();
		sc1.start();
		

	}

}

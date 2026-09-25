package threadpack;

public class DemoThread extends Thread {
	
	public DemoThread(String name){
		super(name);
	}
	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" :Daemon thread");
		}else {
			System.out.println(getName()+" :user thread");
		}
	}
	

	public static void main(String[] args) {
		
		DemoThread sc = new DemoThread("thread 1");
		DemoThread sc2 = new DemoThread("thread 2");
		
		sc.setDaemon(true);
		sc.start();
		sc2.start();
		

	}

}

package threadpack;

class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("task is running . . .");
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		Thread sc = new Thread(task);
		sc.start();
		
	}

}

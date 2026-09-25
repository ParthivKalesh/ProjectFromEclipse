package threadpack;

class Kochi extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("kochi");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadLuminar extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("Luminar");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Luminar {
	

	public static void main(String[] args) {
		
		Kochi sc = new Kochi();
		sc.start();
		
		ThreadLuminar sc1 = new ThreadLuminar();
		sc1.start();

	}

}

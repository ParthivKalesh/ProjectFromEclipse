package threadpack;

class DownloadThread extends Thread{
	@Override
	public void run() {
		super.run();
		for(int i = 1;i<=5;i++) {
			System.err.println("Downloading .... "+(20*i)+"%");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println("downloading completed");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		DownloadThread sc = new DownloadThread();
		sc.start();
		
		for(int i = 1;i<=5;i++) {
			System.err.println("Leetcode grinding .. .");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

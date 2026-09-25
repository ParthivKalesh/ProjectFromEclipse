package threadpack;

class Table1{
	synchronized static void printTable(int n) {
		for(int i = 1;i<=8;i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
//=======================thread one
class MyThreadOne1 extends Thread{
	
	@Override
	public void run() {
		Table1.printTable(4);
	}
}
//==================thread two
class MyThreadTwo1 extends Thread{
	
	@Override
	public void run() {
		Table1.printTable(9);
	}
}

public class StaticSynchro {

	public static void main(String[] args) {
		MyThreadOne1 sc = new MyThreadOne1();
		sc.start();
		MyThreadTwo1 sc1 = new MyThreadTwo1();
		sc1.start();

	}

}

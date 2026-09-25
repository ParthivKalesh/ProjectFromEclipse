package threadpack;
//without synchronization
class Table{
	synchronized void printTable(int n) {
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
class MyThreadOne extends Thread{
	Table t;

	public MyThreadOne(Table t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(7);
	}
}
//==================thread two
class MyThreadTwo extends Thread{
	Table t;

	public MyThreadTwo(Table t) {
		this.t = t;
	}
	@Override
	public void run() {  
		t.printTable(9);
	}
}

public class TestSynchro {

	public static void main(String[] args) {
		Table obj = new Table();
		MyThreadOne sc = new MyThreadOne(obj);
		
		MyThreadTwo sc1 = new MyThreadTwo(obj);
		sc1.start();
		sc.start();
	}

}

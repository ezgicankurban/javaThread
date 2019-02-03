package senkronize.thread.ornek;

public class Runner {
	
	public static Integer i;
	
	public static void main(String[] args) {
		Thread t1 = new Calistir("T1");
		Thread t2 = new Calistir("T2");
		t1.start();
		t2.start();
	}

}

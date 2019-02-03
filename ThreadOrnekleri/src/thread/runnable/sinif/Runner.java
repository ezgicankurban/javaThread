package thread.runnable.sinif;

public class Runner{
	
	public static void main(String[] args) {
		
		System.out.println("Program Baþladý");
		Thread t = new Calistir("thread 1");
		Calistir c = new Calistir("thread 2");
		t.start();
		c.start();
		System.out.println("Program Bitti");
	}

}

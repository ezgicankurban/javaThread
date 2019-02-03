package senkronize.runner;

public class Runner {
	public static Integer a= 0;
	public static void main(String[] args) {
		Thread t = new Thread(()->{veriAl();});
		t.start();
		Thread t1 = new Thread(()->{veriAl();});
		t1.start();
	}
	
	
	public synchronized static  void  veriAl() {
		for (int i = 0; i < 10; i++) {
			System.out.println(a--);
			
		}
	}
	public  synchronized static void veriArtir() {
		for (int i = 0; i < 10; i++) {
			System.out.println(a++);
			
		}
	}

}

package senkronize.runner;

public class Runner {
	public static Integer a= 0;
	public static void main(String[] args) {
		Thread t = new Thread(()->{sayacAzalt("1");});
		t.start();
		Thread t1 = new Thread(()->{sayacAzalt("2");});
		t1.start();
	}
	
	
	public synchronized static  void  sayacAzalt(String isim) {
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + "çalýþtý:" +a--);
			
		}
	}
	public  synchronized static void SayacArtir() {
		for (int i = 0; i < 10; i++) {
			System.out.println(a++);
			
		}
	}

}

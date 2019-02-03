package senkronize.thread.ornek;

public class Calistir extends Thread{
	Object obj = new Object();
	
	public Calistir(String isim) {
		this.setName(isim);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for (Integer i = 0; i < 100; i++) {
			synchronized (i) {
				System.out.println(this.getName() + "   " + i);
			}
			
			
		}
	}

}

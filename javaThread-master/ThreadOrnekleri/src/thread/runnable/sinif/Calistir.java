package thread.runnable.sinif;

public class Calistir extends Thread{
	public Calistir(String isim) {
		// TODO Auto-generated constructor stub
		this.setName(isim);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + " "+ i);
			
		}
	}

}

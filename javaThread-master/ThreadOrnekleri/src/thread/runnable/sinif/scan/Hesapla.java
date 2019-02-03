package thread.runnable.sinif.scan;

public class Hesapla  extends Thread{

	private int sayi = 0;
	public int getSayi() {
		return sayi;
	}
	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hesapla threadi " +2*sayi);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}

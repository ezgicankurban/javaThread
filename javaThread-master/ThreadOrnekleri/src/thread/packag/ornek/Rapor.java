package thread.packag.ornek;

public class Rapor implements Runnable {
	private String isim;
	public Rapor(String isim) {
		this.isim=isim;
	}
	
	
	
	public void run() {
		System.out.println(isim +"Rapor haz�rlan�yor...");
			Utils.bekle(1000);
			System.out.println(isim + "Rapor haz�rland�....");
	}
}

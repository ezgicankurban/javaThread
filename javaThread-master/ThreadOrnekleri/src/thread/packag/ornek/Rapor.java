package thread.packag.ornek;

public class Rapor implements Runnable {
	private String isim;
	public Rapor(String isim) {
		this.isim=isim;
	}
	
	
	
	public void run() {
		System.out.println(isim +"Rapor hazırlanıyor...");
			Utils.bekle(1000);
			System.out.println(isim + "Rapor hazırlandı....");
	}
}

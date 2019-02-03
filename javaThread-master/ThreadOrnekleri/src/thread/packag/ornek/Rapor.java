package thread.packag.ornek;

public class Rapor implements Runnable {
	private String isim;
	public Rapor(String isim) {
		this.isim=isim;
	}
	
	
	
	public void run() {
		System.out.println(isim +"Rapor hazýrlanýyor...");
			Utils.bekle(1000);
			System.out.println(isim + "Rapor hazýrlandý....");
	}
}

package thread.runnable.sinif.scan;

public class Runnner {
	
	public static void main(String[] args) {
		Thread t1= new Hesapla();
		t1.start();
		VeriAl t2 = new VeriAl();
		t2.start();
	}

}

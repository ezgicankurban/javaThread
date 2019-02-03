package thread.packag.ornek;

public class Runner {

	public static void main(String[] args) {
		Thread t1=new Thread (new Rapor("Maaþ "));
		Thread t2=new Thread (new Rapor("Personel "));
		Thread t3=new Thread (new Rapor("Fazla Mesai "));
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Program bitti...");

	}

}

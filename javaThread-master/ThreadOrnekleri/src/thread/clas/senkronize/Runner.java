package thread.clas.senkronize;

public class Runner {
	
	public static int sayac=0;
	public synchronized static void sayacArtýr() {
		
	int i=sayac;
	bekle(100);
	sayac=i+1;
	
	}
	
	public static class Sayac implements Runnable{//extends thread dersek onu direk vebiliriz.
		private String isim;
		
		public Sayac(String isim) {
			this.isim=isim;
	
		}
		
		public void run() {
			for(int i=0; i<10; i++)
			{
				sayacArtýr();
				System.out.println(isim + " Nolu Thread sayac degeri"  + sayac + " oldu");			
				}
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Sayac("1"));
		Thread t2=new Thread(new Sayac("2"));
		t1.start();
		t2.start();
		
		
	}
	
	private static void bekle(int i) {
		
		try {
			Thread.sleep(i);
			
		} catch (InterruptedException e) {
			
		}
	}

}


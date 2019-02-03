package thread.packag.ornek;

public class Utils {
	
	public static void bekle(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

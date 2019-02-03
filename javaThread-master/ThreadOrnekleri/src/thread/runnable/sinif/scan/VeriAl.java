package thread.runnable.sinif.scan;

import java.util.Scanner;

public class VeriAl extends Thread {
	Scanner sc = new Scanner(System.in);
	boolean durum = true;

	@Override
	public void run() {
		while (durum) {
			int veri = sc.nextInt();
			if (veri == -1) {
				durum = false;
				//System.exit(0);
			} else
				System.out.println("Verial thread " + veri);

		}

	}
}

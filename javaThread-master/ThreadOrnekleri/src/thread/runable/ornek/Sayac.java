package thread.runable.ornek;

public class Sayac implements Runnable {

	public Sayac() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}

	}
}
package unknown;

class multiB  {
	public void run() {
		for (int j = 1; j <= 100; j++) {
			System.out.println("Multi2");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MultiA  {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Multi1");
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

public class Multithread1 {
	public static void main(String[] args) {
		MultiA A = new MultiA();
		multiB B = new multiB();

		Thread tr1 = new Thread() {
			public void run() {

				A.run();

			}

		};

		Thread tr2 = new Thread() {
			public void run() {

				B.run();

			}

		};
		tr1.start();
		tr2.start();

	}
}

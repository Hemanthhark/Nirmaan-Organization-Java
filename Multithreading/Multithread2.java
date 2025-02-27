package unknown;

class MultiG {
	public void display() {
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

class MultiH  {

	public void display() {
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



public class Multithread2 {
	public static void main(String[] args) {
		MultiG A=new  MultiG();
		MultiH B=new MultiH();
		Runnable r = new Runnable() {
			public void run() {
				A.display();
				
				
			}
		};
		Thread tr1=new Thread(r);
		
		Runnable r1 = new Runnable() {
			public void run() {
				B.display();
	}

};
Thread tr2=new Thread(r1);
tr1.start();
tr2.start();
	}
}

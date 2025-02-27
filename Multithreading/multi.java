package unknown;
 


class multiB extends Thread {
	public void run(){
		for(int j=1;j<=100;j++) {
			System.out.println("Multi2");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Multithread extends Thread {

	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Multi1");
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}


}

class multi {
	
	public static void main(String[] args) {
		Multithread1 A = new Multithread1
				();
		multiB B = new multiB();
		A.start();
		B.start();
	}
	

}


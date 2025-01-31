package day16;

public class dog extends Animal {
	 void sound() {
		System.out.println("Dog barks");
	}

	public static void main(String[] args) {
		dog d = new dog();
		d.sound();
	}
}
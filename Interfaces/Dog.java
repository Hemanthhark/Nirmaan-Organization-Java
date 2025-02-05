package day17;

public class Dog implements Animal{
	public void move(){
		System.out.println("The Dog runs on four legs");
	}
	@Override
	public void speak() {
		System.out.println("The dog says: Woof woof");

	}


	
}

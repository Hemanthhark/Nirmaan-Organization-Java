package day17;

public class ui {
	public static void main(String[] args) {
		Dog d=new Dog();
		Bird b=new Bird();
		d.move();
		d.speak();
		b.move();
		b.speak();
		
		System.out.println(Animal.isMammal("dog"));
		System.out.println(Animal.isMammal("bird"));
	System.out.println(	d.category);
	System.out.println(	b.category);
	}

}

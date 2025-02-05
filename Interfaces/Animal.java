package day17;

public interface Animal {
	String category="Living Being";
	void move();
	public static boolean isMammal(String animalName) {
		return animalName.equalsIgnoreCase("dog") || animalName.equalsIgnoreCase("cat") || animalName.equalsIgnoreCase("human");	
		}
	
	
	default void speak() {
		System.out.println("Animal is making a sound");
		
	}

}

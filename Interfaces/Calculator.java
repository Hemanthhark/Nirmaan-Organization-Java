package day16;

public interface  Calculator {
	void add(int a,int b);
	void sub(int a,int b);
	default void display(){
		System.out.println("hemanth");
	}
	
	

}

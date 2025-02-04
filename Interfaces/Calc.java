package day16;

import java.util.Scanner;

public class Calc implements Calculator1 {
	
	public void add(int a,int b) {
	System.out.println("Add: " +(a+b));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Sub: " +(a-b));
	}

	@Override
	public void multi(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multi: " +(a*b));
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Divide: " +(a+b));
	}

	@Override
	public void mod(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Mod: " +(a+b));
	}
	public static void main(String[] args) {
		Calc c=new Calc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First num: ");
		int a=sc.nextInt();
		System.out.println("Enter Second num: ");
		int b=sc.nextInt();
		
		c.add(a,b);
		c.sub(a,b);
		c.multi(a,b);
		c.divide(a,b);
		c.mod(a,b);
	}
	

}

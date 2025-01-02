package day8;

import java.util.Scanner;

public class userinterface {
	public static void main(String[] args) {
		calculator calc=new calculator();
//		System.out.println("Addition: " +calc.add(10, 30));
//	
		Scanner se= new Scanner(System.in);
		System.out.println("Enter the fnum:");
		int fnum=se.nextInt();
		System.out.println("Enter the snum:");
		int snum=se.nextInt();
		
		System.out.println("Additon: "+calc.add(fnum, snum));
		System.out.println("Subtraction: "+calc.sub(fnum, snum));
		System.out.println("Multiplication: "+calc.multi(fnum, snum));
		System.out.println("Division: "+calc.division(fnum, snum));
		System.out.println("Modules: "+calc.modules(fnum, snum));
		
		}

}

package day3;

import java.util.Scanner;

public class Conditions {
	public static void main(String[] agrs) {
		
		/*
		 * System.out.println("Enter the mark: "); int student = se.nextInt();
		 * 
		 * if ((student>=35)&&(student<=100)) { if(student>=90){
		 * System.out.println("Hi"); } else if(student>=70) {
		 * System.out.println("Grade B"); } else if(student>=35) {
		 * System.out.println("Grade C"); }
		 * 
		 * }
		 * 
		 * 
		 * else if (student>=100){ System.out.println("Invalid mark"); } else {
		 * System.out.println("Bye"); }
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("Enter the choice");
		
		int check = se.nextInt() ;
		switch (check) {
		case 1: {
			System.out.println("Enter the first num");
			
			int fnum = se.nextInt();
			System.out.println("Enter te Snum");
			
			int snum = se.nextInt();
			System.out.println("Addition : " +(fnum+snum));
			break;
		}
		case 2:{
              System.out.println("Enter the first num");
			
			int fnum = se.nextInt();
			System.out.println("Enter te Snum");
			
			int snum = se.nextInt();
			System.out.println("Addition : " +(fnum-snum));
			break;
			
		}
		case 3:{
              System.out.println("Enter the first num");
			
			int fnum = se.nextInt();
			System.out.println("Enter te Snum");
			int snum = se.nextInt();
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + check);
		}
	}

}

package day4;

import java.util.Scanner;

public class Looping {
	public static void main(String[] agrs) {
//		Scanner se=new Scanner(System.in);
//		System.out.println("Enter your table");
//		int n = se.nextInt();
//		for(int i = 10;i>=0;i--) {
//			System.out.println(i);
//		}
//		for(int i=1;i<=10;i++) {
//			System.out.println(n+"x"+i+"="+n*i);
//		}
//		for(int i=1;i<=100;i++) {
//			if (i%5==0) {
//				System.out.println("Hemanth");
//			}
//			else {
//				System.out.println(i);
//			}

//			System.out.println("i");
//		for(int i = 1;i<=5;i++) {
//			if(i%5==0) {
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
//			for(int i = 1;i<=5;i++) {
//				if(i%5==0) {
//					System.out.println(i); 
//					break;
//				}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

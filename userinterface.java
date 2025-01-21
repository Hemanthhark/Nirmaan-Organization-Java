package day13;

import java.util.Scanner;


public class userinterface {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			book bk1 = new book();
			boolean bool = true;
			while(bool) {
			System.out.println("Enter your choice: " );
			System.out.println("1 for add book name : ");
			System.out.println("2 for update book: ");
			System.out.println("3 for show: ");
			System.out.println("0 for end: ");
			int key = sc.nextInt();
			
			if(key==1) {
				
				System.out.println("enter your book id: ");
				int id = sc.nextInt();
			
				sc.nextLine();
				System.out.println("enter your book name: ");
				
				String name = sc.nextLine();
			
				System.out.println("enter your author name: ");
				String aname = sc.nextLine();
				
				System.out.println("enter your book price: ");
				double price = sc.nextDouble();
			
				bk1 = new book(id,name,aname,price);
				
			}else if(key==2) {
				System.out.println("enter your book id: ");
				int id = sc.nextInt();
				bk1.setId(id);
				sc.nextLine();
				System.out.println("enter your book name: ");
				
				String name = sc.nextLine();
				bk1.setBname(name);
				System.out.println("enter your author name: ");
				String aname = sc.nextLine();
				bk1.setAname(aname);
				System.out.println("enter your book price: ");
				double price = sc.nextDouble();
				bk1.setPrice(price);
				bk1 = new book(id,name,aname,price);
				
				
			}else if (key==3){
				System.out.println(bk1);
				
			}
			else if(key==0){
				bool=false;
				System.out.println("thnak you");
				
			}
			else {
				System.out.println("Invalid value");
			}
			
			}
			
		}

	
		}

	




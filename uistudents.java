package school;

import java.util.Scanner;



public class uistudents {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		students std = new students();
		boolean bool = true;
		while(bool) {
		System.out.println("Enter your choice: " );
		System.out.println("1 for add student : ");
		System.out.println("2 for update student: ");
		System.out.println("3 for show: ");
		System.out.println("0 for end: ");
		int key = sc.nextInt();
		
		if(key==1) {
			
			System.out.println("enter your  : ");
			int id = sc.nextInt();
		
			sc.nextLine();
			System.out.println("enter your student name: ");
			
			String name = sc.nextLine();
		
		    System.out.println("enter your student class: ");
			int classname = sc.nextInt();
			System.out.println("enter your student number: ");
			long phone = sc.nextLong();
		
			std = new students(id,name,classname,phone);
			
		}else if(key==2) {
			System.out.println("enter your student id: ");
			int id = sc.nextInt();
			std.setId(id);
			sc.nextLine();
			System.out.println("enter your student name: ");
			
			String name = sc.nextLine();
			std.setName(name);
			System.out.println("enter your class: ");
			int classname = sc.nextInt();
			std.setClassname(classname);
			System.out.println("enter your student number: ");
			long phone = sc.nextLong();
			std.setPhone(phone);
			std = new students(id,name,classname,phone);
			
			
		}else if (key==3){
			System.out.println(std);
			
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


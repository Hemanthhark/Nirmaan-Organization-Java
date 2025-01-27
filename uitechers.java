package school;

import java.util.Scanner;

public class uitechers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		teachers teach=new teachers();
		boolean bool=true;
		while(bool) {
		System.out.println("enter your key:");
		System.out.println("1 for add teacher info:");
		System.out.println("2 for update teacher info:");
		System.out.println("3 for show teacher info:");
		int key=sc.nextInt();
		switch (key) {
		case 1: {
			
			
			System.out.println("enter your id  : ");
			int id = sc.nextInt();
		
			sc.nextLine();
			System.out.println("enter your teacher name: ");
			
			String name = sc.nextLine();
		
		    System.out.println("enter your teach class: ");
			int classname = sc.nextInt();
			System.out.println("enter your student number: ");
			long phone = sc.nextLong();
			System.out.println("enter your teach salary: ");
			double salary = sc.nextDouble();
		
			teach= new teachers(id, name, classname, phone, salary);
			break;}
			case 2:{
				System.out.println("enter your teach id: ");
				int id = sc.nextInt();
				teach.setId(id);
				sc.nextLine();
				System.out.println("enter your teach name: ");
				
				String name = sc.nextLine();
				teach.setName(name);
				System.out.println("enter your class: ");
				int classname = sc.nextInt();
				teach.setClassname(classname);
				System.out.println("enter your student number: ");
				long phone = sc.nextLong();
				teach.setPhone(phone);
				System.out.println("enter your teach salary: ");
				double salary = sc.nextDouble();
				teach.setSalary(salary);
				teach = new teachers(id, name, classname, phone, salary);
				break;
			}
			case 3:{
				System.out.println(teach);
				break;
			}
			case 4:{
				bool=false;
				System.out.println("bye");
				break;
			}
		
		default:
			System.out.println("invalid info");
		}
	}
}

}

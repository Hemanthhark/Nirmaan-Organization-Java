package Book;
import java.util.ArrayList;
import java.util.Scanner;

public class ui {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		book b=new book();
		 ArrayList<book> arr =new ArrayList<book>();
		boolean bool  =true;
		while(bool) {
	
		    System.out.println("Enter your choice");
		    System.out.println( "1 for add book");
		    System.out.println("2 for update book");
		    System.out.println("3 for show book ");
		    System.out.println("4 for remove book ");
		    System.out.println("5 for Exit ");
		    
		    int key = sc.nextInt();
			if(key==1) {
				System.out.println("Enter book id:");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter book name:");
				String bname = sc.nextLine();
				System.out.println("Enter authur name:");
				String aname = sc.nextLine();
				System.out.println("Enter book price:");
				double price = sc.nextDouble();
				arr.add(b =new book(id, bname, aname, price));
				
			}
			else if (key==2) {
				System.out.println("Enter book id:");
				int id = sc.nextInt();
					sc.nextLine();
					
					for(book b1 : arr) {
						if(b1.getBid()==id) {
							System.out.println("Enter the book Name");
							String name = sc.nextLine();
							b1.setBname(name);
							System.out.println("Enter the author name");
							String aname = sc.nextLine();
							b1.setAname(aname);
							System.out.println("Enter the book price");
							int price =sc.nextInt();
							b1.setPrice(price);
						}else {
							System.out.println("invalid id");
						}
									
			}
			}
					else if(key==3) {
				System.out.println(arr);
			}
			 else if (key == 4) {
					System.out.println("Enter the book id : ");
					int id1 = sc.nextInt();
					sc.nextLine();
					for(book b2 : arr) {
						if(b2.getBid()==id1){
							arr.remove(b2);
							break;
						}
			
		}
	}
			 else if(key==5) { 
				 bool=false;
				 System.out.println("Good Bye.....");
			
	
			 }
		}
	
}
	}

	
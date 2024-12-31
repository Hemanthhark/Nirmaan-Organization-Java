package day7;

public class OOPPS {
	String name;
	 String id;
	long phone;
	double salary;
	public static void main(String[] args) {
		OOPPS employee1= new OOPPS();
		employee1.name= "Hemanth";
		
		employee1.id= "a1";
		employee1.phone= 1234567890l;
		employee1.salary= 150000.5443d;
		
		OOPPS employee2= new OOPPS();
		employee2.name= "Ram";
		employee2.id= "b1";
		employee2.phone= 22434567890l;
		employee2.salary= 250000.66d;
		
		OOPPS employee3= new OOPPS();
		employee3.name= "Sathya";
		employee3.id= "a1";
		employee3.phone= 8034567890l;
		employee3.salary= 500000d;
		
		OOPPS employee4= new OOPPS();
		employee4.name= "Suresh";
		employee4.id= "a1";
		employee4.phone= 9234567890l;
		employee4.salary= 150000.45d;
		
		OOPPS employee5= new OOPPS();
		employee5.name= "ganesh";
		employee5.id= "a1";
		employee5.phone= 7234567890l;
		employee5.salary= 1050000d;
		
		System.out.println("employee name: "+employee1.name +"\n"+"employee id: "+ employee1.id +"\n"+ "employee phone: "+employee1.phone +"\n"+"employee salary: "+ employee1.salary );
		
		
	}
	

}

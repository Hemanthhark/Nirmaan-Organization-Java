package day9;

public class constructor {
	int id;
	String name;
	
	constructor(int id, String nameofcar){
		this.id= id;
		 name = nameofcar;
	}
	
	public static void main(String[] args) {
		constructor constructor1 = new constructor(1001,"Volvo");
		System.out.println("Id: "+constructor1.id+" "+"Name: "+ constructor1.name);
		constructor constructor2 = new constructor(1002,"Benz");
		System.out.println("Id: "+constructor2.id+" "+"Name: "+ constructor2.name);
		
	}

}

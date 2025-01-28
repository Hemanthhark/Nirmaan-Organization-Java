package day15;

public class inheritanceui {
	public static void main(String[] args) {
		//single 
		Car c =new Car();
		c.startEngine();
		c.drive();
		//Multilevel
		ElectricCar e= new ElectricCar();
	
		e.startEngine();
		e.chargeBattery();
		e.drive();
		//Hierarchical
		Bike b= new Bike();
		c.startEngine();
		b.kickStart();
		c.drive();
	}

}

package day12;
class Employee{
	private int id;
	 private String name;
	 private double salary;
	 private long phone;
	 
	 public void setId(int id) {
		 this.id= id;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setName(String name) {
		 this.name= name;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setSalary(double salary) {
		 this.salary= salary;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void setPhone(long phone) {
		 this.phone= phone;
	 }
	 public long getPhone() {
		 return phone;
	 }
	 public String toString() {
			return "Employee id:"+id+"\n"+"Employee Name: "+name+"\n"+"Employee Salary:"+salary+"\n"+"Employee:"+phone;
			
		}
	 
}

public class accessspecifier {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(101);
		
		emp1.setName("Hemanth");

		emp1.setSalary(50000.99d);
	
		emp1.setPhone(9019090909l);

		System.out.println(emp1);
		
	}

}

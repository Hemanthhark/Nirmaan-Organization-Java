package school;

public class teachers {
	private int id;
	 private String name;
	 private int classname ;
	 private long phone;
	 private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassname() {
		return classname;
	}
	public void setClassname(int classname) {
		this.classname = classname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public teachers(int id, String name, int classname, long phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.classname = classname;
		this.phone = phone;
		this.salary = salary;
	}
	public teachers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		return "book [id=" + id + ", name=" + name + ", classname=" + classname + ", phone=" + phone + ", salary=" + salary + "]";
	}
	
}

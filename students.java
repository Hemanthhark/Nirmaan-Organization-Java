package school;

public class students {
	private int id;
	 private String name;
	 private int classname ;
	 private long phone;
	
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
	
	
	public students(int id, String name, int classname, long phone) {
		
		this.id = id;
		this.name = name;
		this.classname = classname;
		this.phone = phone;
	
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		return "book [id=" + id + ", name=" + name + ", classname=" + classname + ", phone=" + phone + "]";
	}
	
}



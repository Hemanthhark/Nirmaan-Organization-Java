package Book;

public class book {
	int bid;
	private String bname;
	private String aname;
	private double price;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public book(int bid, String bname, String aname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "book [bid=" + bid + ", bname=" + bname + ", aname=" + aname + ", price=" + price + "]";
	}
	
	

}

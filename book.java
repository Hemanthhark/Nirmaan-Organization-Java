package day13;

 class book {
	
	
		private int id;
		 private String bname;
		 private String aname ;
		 private double price;
		 
		
		
		 public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
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



		public book(int id, String bname, String aname, double price) {
			super();
			this.id = id;
			this.bname = bname;
			this.aname = aname;
			this.price = price;
		}
		public book() {
			
		}


		@Override
		public String toString() {
			return "book [id=" + id + ", bname=" + bname + ", aname=" + aname + ", price=" + price + "]";
		}
		 
	}

	
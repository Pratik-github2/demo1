package Has_A_Relationship;

public class Mobile {
	
	private String brand;
	private String model;
	private double price;
	
	private Sim1 s1;
	private Sim2 s2;
	
	
	public Mobile(String brand, String model, double price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Sim1 getS1() {
		return s1;
	}
	public void setS1(Sim1 s1) {
		this.s1 = s1;
	}
	public Sim2 getS2() {
		return s2;
	}
	public void setS2(Sim2 s2) {
		this.s2 = s2;
	}
	
		public void printMobileDetails() {
			System.out.println("======Mobile=======");
			System.out.println("brand: "+brand);
			System.out.println("model: "+model);
			System.out.println("price: "+price);
			
			if(s1!=null) {
				s1.printSim1Details();
			}else {
				System.out.println("s1 is not inserted");
			}
			
			if(s2!=null) {
				s2.printSim2Details();
			}else {
				System.out.println("s2 is not inserted");
			}
		}

}

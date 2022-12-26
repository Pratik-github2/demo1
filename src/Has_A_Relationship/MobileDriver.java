package Has_A_Relationship;

public class MobileDriver {
	
	public static void main(String[] args) {
		
		Mobile m=new Mobile("Apple","Iphone14pro",112000);
		m.setS1(new Sim1("Jio",981971011));
		m.setS2(new Sim2("Airtel",981971772));
		m.printMobileDetails();
	}

}

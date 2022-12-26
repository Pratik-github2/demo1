package Encapsulation;

public class LaptopDriver {
    
	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.setBrand("Lenovo");
		l.setModel("Ideapad 330");
		l.setPrice(55000);
		
		Laptop l1=new Laptop();
		l1.setBrand("Asus");
		l1.setModel("VivoBook 14");
		l1.setPrice(50000);
		
		System.out.println(l.getBrand());
		System.out.println(l.getModel());
		System.out.println(l.getPrice());
		System.out.println("============================================");
		System.out.println(l1.getBrand());
		System.out.println(l1.getModel());
		System.out.println(l1.getPrice());
	}
	
	
}

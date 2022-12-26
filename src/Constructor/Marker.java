package Constructor;

public class Marker {
   String brand;
   String color;
   double price;
   public static void main(String[] args) {
	Marker m=new Marker();
	m.brand="Camelin";
	m.color="black";
	m.price=30;
	
	Marker m1=new Marker();
	m1.brand="Camelin";
	m1.color="blue";
	m1.price=40;
	
	Marker m2=new Marker();
	m2.brand="Camelin";
	m2.color="green";
	m2.price=35;
	
	System.out.println(m);
	System.out.println(m.brand);
	System.out.println(m.color);
	System.out.println(m.price);
	System.out.println("===========================");
	System.out.println(m1);
	System.out.println(m1.brand);
	System.out.println(m1.color);
	System.out.println(m1.price);
	System.out.println("===========================");
	System.out.println(m2);
	System.out.println(m2.brand);
	System.out.println(m2.color);
	System.out.println(m2.price);
}
	
	
	
}

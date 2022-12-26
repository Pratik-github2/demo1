package Has_A_Relationship1;

public class Tv {
   private String brand;
   private double price;
   
   private Remote r;
   private Connection c;
   
   public Tv(String brand, double price) {
	   this.brand=brand;
	   this.price=price;
   }
   
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Remote getR() {
	return r;
}
public void setR(Remote r) {
	this.r = r;
}
public Connection getC() {
	return c;
}
public void setC(Connection c) {
	this.c = c;
}
   
   public void printTvDetails(){
	   System.out.println("===========Tv=============");
	   System.out.println("Brand Name is: "+brand);
	   System.out.println("Price is:"+price);
	   
	   if(r!=null) {
		   r.printRemoteDetails();
	   }else {
		   System.out.println("Remote is not inserted");
	   }
	   
	   if(c!=null) {
		   c.printConnectionDetails();
	   }else {
		   System.out.println("Connection Is Not There....");
	   }
   }
}

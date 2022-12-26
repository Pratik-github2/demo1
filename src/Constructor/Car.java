package Constructor;

import java.util.Objects;

public class Car {

	private int id;
	private String brand;
	private String name;
	
	public Car() {
		System.out.println("No args");
	}
	
	public Car(int id) {
		this();
		this.id=id;
		System.out.println("1 args");
	}
	public  Car(int id, String brand) {
		this(id);
		this.brand=brand;
		System.out.println("2 args");
	}
	public  Car(int id, String brand,String name) {
		this(id,brand);
		this.name=name;
		System.out.println("3 args");
	}
	
	public String toString(){
		return id+brand+name;     //here (return id+brand+name) is also a retuen type or u can pass args also
	}
	
	public boolean equals(Object o) {
		Car c=(Car)o;
		if(c.id==this.id&&c.brand==this.brand&&c.name==this.name) {
			return true;
		}else {
			return false;
		}
	}
	
//	public int hashcode() {
//		return Objects.hash(id,brand,name);
//	}
	
	public static void main(String[] args) {
		Car c=new Car(1,"BMW","X20");
		Car c1=new Car(1,"BMW","X20");
//		System.out.println(c.id);
//		System.out.println(c.brand);
//		System.out.println(c.name);
//		System.out.println(c);
		System.out.println(c.equals(c1));
//		int a=c.hashcode();
//		int b=c1.hashcode();
//		System.out.println(c.hashCode());
//		System.out.println(c1.hashCode());
//		System.out.println(c.equals(c1));
		
	}
}

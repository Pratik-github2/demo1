package exercise.cylinder;

public class Driver {
public static void main(String[] args) {
	
	cylinder c=new cylinder();
	c.setRadius(9);
	int h=c.getRadius();
	System.out.println(h);
	c.setHeight(12);
	int r=c.getHeight();
	System.out.println(r);
	System.out.println(c.sa());
	System.out.println(c.volume());
	
	
	
	
}
}

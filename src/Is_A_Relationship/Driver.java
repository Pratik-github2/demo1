package Is_A_Relationship;

public class Driver {
public static void main(String[] args) {
	Father f=new Son();    //Upcasting
	Son a=(Son) f;          //Downcasting
	f.BuyLand();
	f.BuyHouse();
	f.BuyCar();
	
}
}

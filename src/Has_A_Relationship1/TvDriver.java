package Has_A_Relationship1;

public class TvDriver {
	public static void main(String[] args) {
		Tv t=new Tv("Mi",45000);
		t.setR(new Remote("Button & Voice Recognize"));
		t.setC(new Connection("Den"));
		t.printTvDetails();
		
	}

}

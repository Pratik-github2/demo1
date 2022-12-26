package Has_A_Relationship1;

public class Connection {
	private String cable;

	public Connection(String cable) {
		this.cable=cable;
	}

	
	
	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}
	
	public void printConnectionDetails() {
		System.out.println("========Connection=========");
		System.out.println("Cable Operator Is: "+cable);
	}
	

}

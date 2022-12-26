package Has_A_Relationship;

public class Sim1 {
	private String service_provider;
	private long phno;

	
	
	public Sim1(String service_provider, int phno) {
		this.service_provider=service_provider;
		this.phno=phno;
	}



	public String getService_provider() {
		return service_provider;
	}



	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}



	public long getPhno() {
		return phno;
	}



	public void setPhno(long phno) {
		this.phno = phno;
	}



	public void printSim1Details() {
		System.out.println("===========sim1=============");
		System.out.println("Service provider is: "+service_provider);
		System.out.println("Contact no is: "+phno);
	}	
}

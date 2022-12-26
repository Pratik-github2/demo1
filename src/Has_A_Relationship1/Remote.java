package Has_A_Relationship1;

public class Remote {
	
	private String model;
	
	public Remote(String model) {
		this.model=model;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void printRemoteDetails() {
		System.out.println("==========Remote===========");
		System.out.println("Remote type is: "+model);
	}
	
}

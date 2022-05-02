package Abreu.ENUMS;

public enum Connectivity {
	
	Edge("Interior", "Standard Speed"),
	BackBone("Exterior", "Standard Speed"),
	Forward("Port Forwarding", "High Speed");
	
	private String name;
	private String speed;
	
	Connectivity(String name, String speed) {
		
	}
}

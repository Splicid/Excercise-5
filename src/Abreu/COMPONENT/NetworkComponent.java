package Abreu.COMPONENT;

import Abreu.ENUMS.Network;


public class NetworkComponent {

	private String cid;
	private int ports;
	private int entryPort;
	private int exitPort;
	private Network AssignedTo;
	
	public NetworkComponent(String cid, int ports, int entryPort, int exitPort, Network assignedTo) {
		this.cid = cid;
		this.ports = ports;
		this.entryPort = entryPort;
		this.exitPort = exitPort;
		this.AssignedTo = assignedTo;
	}
	
	public String toString() {
		return " NetWorkComponents\n "
				+ "\nCID: " + this.cid
				+ "\nPorts: " + this.ports;
	}
}

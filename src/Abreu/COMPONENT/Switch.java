package Abreu.COMPONENT;

import Abreu.ENUMS.Network;

public class Switch extends NetworkComponent{

	private boolean stackable;
	private boolean poe;
	public Switch(String cid, int ports, int entryPort, int exitPort, Network assignedTo) {
		super(cid, ports, entryPort, exitPort, assignedTo);
		
	}

}

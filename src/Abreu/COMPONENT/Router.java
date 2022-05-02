package Abreu.COMPONENT;

import Abreu.ENUMS.Connectivity;
import Abreu.ENUMS.Network;
import Abreu.ENUMS.RouteFinding;
import Abreu.ENUMS.Routing;

public class Router extends NetworkComponent{

	private Routing RType;
	private RouteFinding routeFinding;
	private Connectivity connectivity;
	public Router(String cid, int ports, int entryPort, int exitPort, Network assignedTo) {
		super(cid, ports, entryPort, exitPort, assignedTo);
		// TODO Auto-generated constructor stub
	}

}

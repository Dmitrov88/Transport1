package by.htp.project.transport.entity;

public class Report {
	
	private Transport[] transport;
	
	public Transport[] getTransport() {
		return transport;
	}

	public void setTransport(Transport[] transport) {
		this.transport = transport;
	}
	
	public void sortBySpeed() {
		
	}

	public void display() {
		for (Transport t:transport) {
			System.out.println(t.getName());
		}
	}

}

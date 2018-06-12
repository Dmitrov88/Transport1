package by.htp.project.transport.entity;

public class Transport {
	
	private String name;
	private double speed;
	private double cost;

		
	public Transport(String name, double speed, double cost) {
		this.name = name;
		this.speed = speed;
		this.cost = cost;
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public  double getCost()	{
		return cost;
	}
		
	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

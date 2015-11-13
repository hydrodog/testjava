package edu.stevens.robosim;

public class Sub extends Robot{
	double buoyancy;
	
	public Sub(Vector pos, Vector vel, double theta, double pitch, 
			double mass, double battery, double battery_max, double voltage, double vel_max, double buoyancy)
	{
		super(pos, vel,mass,battery, battery_max,vel_max,theta);
		//pitch, voltage, buoyancy
	}
	
	public void move(Vector v)
	{
		
	}
}


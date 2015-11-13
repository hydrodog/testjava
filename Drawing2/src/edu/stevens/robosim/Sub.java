package edu.stevens.robosim;

public class Sub extends Robot{
	double buoyancy;
	
	public Sub(Vector pos, Vector vel, int theta, int pitch, 
			int mass, int battery, int battery_max, int voltage, int vel_max, double buoyancy)
	{
		super(pos, vel,mass,battery, battery_max,vel_max,theta);
		//pitch, voltage, buoyancy
	}
	
	public void move(Vector v)
	{
		
	}
}


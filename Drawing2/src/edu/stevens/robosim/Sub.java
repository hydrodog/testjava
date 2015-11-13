package edu.stevens.robosim;

public class Sub extends Robot{
	double buoyancy;
	
	public Sub(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double battery_life, double max_cur, double max_vel, double theta, double buoyancy, Angle angle, double degree )
	{
		super(realposition, realvelocity, imageposition, imagevelocity, mass,battery_life, max_cur, max_vel, theta);
		//pitch, voltage, buoyancy
		pitch(angle,degree);
	}
	
	public void move(Vector vel, Vector water_vel)
	{
		
	}
	
	private void damaged()
	{
		
	}
	public void stop()
	{
		
	}
	public void pitch(Angle angle, double degree)
	{
		
	}
}


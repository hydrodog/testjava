package edu.stevens.robosim;

public class Sub extends Robot{
	double buoyancy;
	
	public Sub(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double battery_life, double max_cur, double max_vel, double theta, double buoyancy)
	{
		super(realposition, realvelocity,imageposition,imagevelocity, mass,battery_life,max_cur,max_vol,theta);
		//pitch, voltage, buoyancy
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


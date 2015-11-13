package edu.stevens.robosim;

public class Sub extends Robot{
	double buoyancy;
	Angle angle;
	double degree;
	public Sub(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double battery_life, double max_cur, double max_vel, double theta, double buoyancy, Angle angle, double degree )
	{
		super(realposition, realvelocity, imageposition, imagevelocity, mass,battery_life, max_cur, max_vel, theta);
		//pitch, voltage, buoyancy
		pitch(angle,degree);
		this.buoyancy = buoyancy;
	}
	
	public void move(Vector vel, Vector water_vel)
	{
		
	}
	
	private void damaged()
	{
		double dam=0;
		double waterdepth;
		if(getRealPosition()>waterdepth)
			dam++;
		if(dam>10)
			stop();
	}
	public void stop()
	{
		setRealVelocity(new Vector(0,0,0));
	}
	public void pitch(Angle angle, double degree)
	{
		this.angle = angle;
		this.degree = degree;
	}
}


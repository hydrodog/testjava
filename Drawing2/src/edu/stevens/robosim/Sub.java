package edu.stevens.robosim;
/**
   @author: Jinghao Xing
   @author: Xiaoyu Fan
   @author: Xi Li
*/

public class Sub extends Robot{
	double buoyancy;
	Angle angle;
	double degree;
	// Constructor.
	public Sub(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double battery_life, double max_cur, double max_vel, double theta, double voltage, 
			double buoyancy, Angle angle, double degree)
	{
		super(realposition, realvelocity, imageposition, imagevelocity, mass,battery_life, 
			max_cur, max_vel, theta, voltage);
		//pitch, voltage, buoyancy
		pitch(angle,degree);
		this.buoyancy = buoyancy;
	}
	// Move method (realVelocity need be set in advance).
	// water_vel denote the water velocity.
	public void move(Vector water_vel)
	{
		Vector v = getRealPosition();
		v.add(getRealVelocity().add(water_vel));
		setRealPosition(v);
	}
	// When collision happens, dam++; after 10 times collision, submarine will be totally damaged.
	private void damaged()
	{
		double dam = 0;
		double waterdepth = 1000;
		if(getRealPosition().getZ() > waterdepth)
			dam++;
		if(dam>10)
			stop();
	}
	// stop this submarine.
	public void stop()
	{
		setRealVelocity(new Vector(0,0,0));
	}
	// set pitch
	public void pitch(Angle angle, double degree)
	{
		this.angle = angle;
		this.degree = degree;
	}
}


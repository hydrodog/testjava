

package edu.stevens.robosim;

public abstract class Car extends Robot{
	public Car(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double batter_life, double max_cur, double max_vel, double theta, double voltage,
			int NumWheel){
		super(realposition,realvelocity,imageposition,imagevelocity,mass,batter_life,max_cur,max_vel,theta,voltage);
	}
	
	public Vector move(Vector realpositon, Vector imagevelocity){
		return realpositon.add(imagevelocity);
	}
	
	public abstract void stop();
	
}

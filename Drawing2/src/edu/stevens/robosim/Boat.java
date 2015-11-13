package edu.stevens.robosim;

public abstract class Boat extends Robot{
	public Boat(Vector position, Vector velocity, double mass, double batter_life, double max_cur, double max_vol,
			double theta) {
		super(position, velocity, mass, batter_life, max_cur, max_vol, theta);
	}
	private double depth;
		
}

public class Speed extends Boat{
	public Speed(Vector position, Vector velocity, double mass, double batter_life, double max_cur, double max_vol,
			double theta) {
		super(velocity, velocity, theta, theta, theta, theta, theta);
			}
	private double mph;
	private double accelerate;
	private double decelerate;

	public void pitch(double angle, double degree) {
		
	}

	public void stop() {
		
	}
}




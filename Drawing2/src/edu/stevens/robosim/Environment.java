package edu.stevens.robosim;

public abstract class Environment {
	private double x;
	private double y;
	private double z;
	private double r;
	private double getX(){ return 0;}
	private double getY(){ return 0;}
	private double getZ(){ return 0;}
	private static Random r(){};
	public static int dieRoll() { return r.nextInt(6) + 1; }

	
	
	
}

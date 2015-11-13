package edu.stevens.robosim;

public abstract class Environment {
	private double x;
	private double y;
	private double z;
	private double r;
	private double landheight;
	private double waterdepth;
	private double waterspeed;
	private double airspeed;
	private double airdirection;	
	public double getX(){ return 0;}
	public double getY(){ return 0;}
	public double getZ(){ return 0;}
	public static Random r(){};
	public double getLandheight(){ return 0;}
	public double getWaterdepth(){ return 0;}
	public double getWaterspeed(){ return 0;}
	public double getAirspeed(){ return 0;}
	public double getAirdirection(){ return 0;}
	public static int dieRoll() { return r.nextInt(6) + 1; }

	
	
	
}

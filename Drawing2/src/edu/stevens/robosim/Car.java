package edu.stevens.robosim;

public abstract class Car extends Robot{
	private int NumWheel;
	private double LRotVol,RRotVol;
	public Car(Vector position, Vector velocity, double mass,
			double batter_life, double max_cur, double max_vol, double theta,
			int NumWheel,double LRotVol,double RRotVol){
		super(position,velocity,mass,batter_life,max_cur,max_vol,theta);
		this.NumWheel=NumWheel;
		this.LRotVol=LRotVol;
		this.RRotVol=RRotVol;
	}
	
}

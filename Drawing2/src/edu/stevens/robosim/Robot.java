package edu.stevens.robosim;

public abstract class Robot {
	private enum Angle{up, down}
	private double mass;
	private double ampLife;
	public abstract void pitch(Angle angle, double degree);
	public double mass(){return mass;}
	public double batteryLife(){ return ampLife;}
}

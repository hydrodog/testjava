package edu.stevens.robosim;

public abstract class Robot {
	private Vector position;
	private Vector velocity;
	private enum Angle{up, down}
	private double mass;
	private double batter_life;
	private double voltage;
	private double max_cur;
	private double max_vol;
	private double theta;
	public abstract void pitch(Angle angle, double degree);
	public double mass(){return mass;}
	public Robot(Vector position, Vector velocity, double mass,
			double batter_life, double max_cur, double max_vol, double theta) {
		super();
		this.position = position;
		this.velocity = velocity;
		this.mass = mass;
		this.batter_life = batter_life;
		this.max_cur = max_cur;
		this.max_vol = max_vol;
		this.theta = theta;
		this.voltage = max_vol;
	}
	
	public abstract void stop();
	
	//=============getter and setter=======
	public Vector getPosition() {
		return position;
	}
	public void setPosition(Vector position) {
		this.position = position;
	}
	public Vector getVelocity() {
		return velocity;
	}
	public void setVelocity(Vector velocity) {
		this.velocity = velocity;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getBatter_life() {
		return batter_life;
	}
	public void setBatter_life(double batter_life) {
		this.batter_life = batter_life;
	}
	public double getVoltage() {
		return voltage;
	}
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	public double getMax_cur() {
		return max_cur;
	}
	public void setMax_cur(double max_cur) {
		this.max_cur = max_cur;
	}
	public double getMax_vol() {
		return max_vol;
	}
	public void setMax_vol(double max_vol) {
		this.max_vol = max_vol;
	}
	public double getTheta() {
		return theta;
	}
	public void setTheta(double theta) {
		this.theta = theta;
	}
	
	
	
}
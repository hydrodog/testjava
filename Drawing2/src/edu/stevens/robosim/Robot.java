package edu.stevens.robosim;

public abstract class Robot {
	private Vector realPosition;
	private Vector realVelocity;
	private Vector imagePosition;
	private Vector imageVelocity;
	
	private enum Angle{up, down}
	private double mass;
	private double batter_life;
	private double voltage;
	private double max_cur;
	private double max_vel;
	private double theta;
	public abstract void pitch(Angle angle, double degree);
	public double mass(){return mass;}
	public Robot(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double batter_life, double max_cur, double max_vel, double theta, double voltage) {
		super();
		this.realPosition = realposition;
		this.realVelocity = realvelocity;
		this.imagePosition = imageposition;
		this.imageVelocity = imagevelocity;
		
		this.mass = mass;
		this.batter_life = batter_life;
		this.max_cur = max_cur;
		this.max_vel = max_vel;
		this.theta = theta;
		this.voltage = voltage;
	}
	
	public abstract void stop();
	
	//=============getter and setter=======
	public Vector getRealPosition() {
		return realPosition;
	}
	public void setRealPosition(Vector position) {
		this.realPosition = position;
	}
	public Vector getRealVelocity() {
		return realVelocity;
	}
	public void setImageVelocity(Vector velocity) {
		this.realVelocity = velocity;
	}
	public Vector getImagePosition() {
		return imagePosition;
	}
	public void setImagePosition(Vector position) {
		this.imagePosition = position;
	}
	public Vector getImageVelocity() {
		return imageVelocity;
	}
	public void setRealVelocity(Vector velocity) {
		this.imageVelocity = velocity;
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
		return max_vel;
	}
	public void setMax_vol(double max_vel) {
		this.max_vel = max_vel;
	}
	public double getTheta() {
		return theta;
	}
	public void setTheta(double theta) {
		this.theta = theta;
	}
	
	
}
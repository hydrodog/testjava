package edu.stevens.robosim;

public abstract class Car extends Robot{
	private int NumWheel;
	private double LRotVol,RRotVol;
	public Car(int NumWheel,double LRotVol,double RRotVol){
		this.NumWheel=NumWheel;
		this.LRotVol=LRotVol;
		this.RRotVol=RRotVol;
	}
	
}

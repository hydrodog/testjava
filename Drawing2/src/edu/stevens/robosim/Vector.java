package edu.stevens.robosim;

public class Vector {
	
private double x, y, z;
	
	public Vector( double x, double y, double z){	
		this.x=x;
		this.y=y;
		this.z=z;		
	}
	
	double getX(){
		return x;
	}
	
	double getY(){
		return y;
	}
	
	double getZ(){
		return z;
	}
	
	void add(double a, double b, double c){
		x = x + a;
		y = y + b;
		z = z + c;
	}
	
	void add(Vector v){
		x = x + v.x;
		y = y + v.y;
		z = z + v.y;
	}
	
	void change (double a, double b, double c){
		x = a;
		y = b;
		x = c;
	}
	double getMag(){
		return Math.sqrt(x*x + y*y +z*z);
	}
}

//Authors: Chris Coyle and Pratibha V

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
	
	Vector add(double a, double b, double c){
		this.x += a;
		this.y += b;
		this.z += c;
		return this;
	}
	
	Vector add(Vector v){
		this.x += v.x;
		this.y += v.y;
		this.z += v.y;
		return this;
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

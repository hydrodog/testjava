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
		Vector temp = new Vector(0,0,0);
		temp.x = this.x + a;
		temp.y = this.y + b;
		temp.z = this.z + c;
		return temp;
	}
	
	Vector add(Vector v){
		Vector temp = new Vector(0,0,0);
		temp.x = this.x + v.x;
		temp.y = this.y + v.y;
		temp.z = this.z + v.y;
		return temp;
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

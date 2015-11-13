package edu.stevens.robosim;

import java.lang.Math;


public class Compass {
	
	
	
	private double PI = 3.14159;
	
	private int direction;

	 Compass(Vector v){
		 
		 int deg = (int)(atan2(v.getX(), v.getY()));
		 
		 if (v.getX() >=0 && v.getY() >=0){
			 direction = 90 - deg;
		 }
		 
		 if (v.getX() >=0 && v.getY() < 0){
			 direction = 90 + deg;
		 }
		 
		 if (v.getX() < 0 && v.getY() < 0){
			 direction = 270 - deg;
		 }
		 
		 if (v.getX() < 0 && v.getY() >= 0){
			 direction = 270 + deg;
		 }
		 }
	
	 	
	 	int getDirection(){
		 
		 return direction;	 
		
	 	}
	
	
}

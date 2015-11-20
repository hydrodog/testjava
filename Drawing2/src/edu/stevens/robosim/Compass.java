package edu.stevens.robosim;

import java.lang.Math;


public class Compass {
		
	public int direction;

	 Compass(Vector v){
		 
		 int deg = (int)((180/Math.PI)*Math.atan2(v.getX(), v.getY()));
		 
		direction = 90 - deg;
		
		if (direction < 0 ){
			
			direction = direction + 360;
		}
		
		if (direction >360){
			
			direction = direction - 360;
		}
	 
	 	}
	
	 	
	 	int getDirection(){
		 
		 return direction;	 
		
	 	}
	
	
}

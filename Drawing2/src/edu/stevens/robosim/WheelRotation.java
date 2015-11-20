/**
@author: Raya Rahman
*/

package edu.stevens.robosim;

public class WheelRotation {
	
	
	int angleInDegrees;
	int slippageError;
	int time;
	
	// Constructor
	public WheelRotation(int angle, int slipError, int time){
		this.angleInDegrees = angle;
		this.slippageError = slipError;
		this.time = time;
	}

	// Getter method for angle in degrees
	public int getAngleInDegrees() {
		return angleInDegrees;
	}

	// Setter method for angle in degrees
	public void setAngleInDegrees(int angleInDegrees) {
		this.angleInDegrees = angleInDegrees;
	}

	
	// Getter method for slippage Error
	public int getSlippageError() {
		return slippageError;
	}

	// Setter method for slippage Error
	public void setSlippageError(int slippageError) {
		this.slippageError = slippageError;
	}

	
	// Getter method for time
	public int getTime() {
		return time;
	}

	// Setter method for time
	public void setTime(int time) {
		this.time = time;
	}
	
	
	// Method to calculate angular velocity
	public float angularVelocity(){
		float angularVelocity = (this.angleInDegrees -this.slippageError)/this.time;
	}
	

}

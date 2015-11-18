

package edu.stevens.robosim;

public class Car extends Robot{
	public Car(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double batter_life, double max_cur, double max_vel, double theta, double voltage,
			int NumWheel){
		super(realposition,realvelocity,imageposition,imagevelocity,mass,batter_life,max_cur,max_vel,theta,voltage);
	}
	
	public void move(Vector CarSpeed){
		Vector v = getRealPosition();
		setRealPosition(v.add(getRealVelocity().add(CarSpeed)));
	}
	
	public void stop(){
		setRealVelocity(new Vector(0,0,0));
	};

	public void pitch(Angle angle, double degree) {
		// TODO Auto-generated method stub
		
	}
	
}

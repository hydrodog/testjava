
package edu.stevens.robosim;
/**
@author: Hengyu Liang
@author: Shuai Lu
@author: Zahra
*/
public class Car extends Robot{
	Angle angle;
	double degree;
	public Car(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double batter_life, double max_cur, double max_vel, double theta, double voltage){
		super(realposition,realvelocity,imageposition,imagevelocity,mass,batter_life,max_cur,max_vel,theta,voltage);
	}
	//It there is water return true.
	public boolean Water(){
		if(getRealPosition().getZ()<0){
			return true;
		}
		return false;
	}
	// If a want to turn, just set the Carspeed to a unit Vector. And the speed of the car would be the length of Vector Carspeed.
	// And if there is water it will stop();
	public void move(Vector CarSpeed){
		if (Water()==true){
			stop();
		}else{
			Vector v = getRealPosition();
			setImageVelocity(CarSpeed);
			setRealPosition(v.add(CarSpeed));
		}
		
	}
	//To stop the car, we can set the real_velocity to (0,0,0).
	public void stop(){
		setRealVelocity(new Vector(0,0,0));
	};

	public void pitch(Angle angle, double degree) {
		// TODO Auto-generated method stub
		this.angle=angle;
		this.degree=degree;
	}

}

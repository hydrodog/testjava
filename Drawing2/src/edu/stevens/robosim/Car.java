
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
	//If there is water, return true.
	public boolean Water(){
		if(getRealPosition().getZ()<0){
			return true;
		}
		return false;
	}
	//If we want to move, we need to set the CarVelocity, the speed will be the length of this Vector
	//And the direction will be the direction of this Vector
	// And if there is water it will stop();
	public void move(Vector CarVelocity){
		if (Water()==true){
			stop();
		}else{
			Vector v = getRealPosition();
			setImageVelocity(CarVelocity);
			setRealPosition(v.add(CarVelocity));
		}
		
	}
	//To stop the car, we can set the real_velocity to 0.
	public void stop(){
		setRealVelocity(new Vector(0,0,0));
	};

	public void pitch(Angle angle, double degree) {
		// TODO Auto-generated method stub
		this.angle=angle;
		this.degree=degree;
	}

}

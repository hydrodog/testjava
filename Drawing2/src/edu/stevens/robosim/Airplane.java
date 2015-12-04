package edu.stevens.robosim;
/**
 * 
 * @author Jun ShangG
 * @author Xin Pan
 * @author Jintao Li
 *
 */

public class Airplane extends Robot{
	Angle angle;
	double degree;
	
	public Airplane(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double batter_life, double max_cur, double max_vol, double theta,double voltage){
		super(realposition,realvelocity,imageposition,imagevelocity,mass,batter_life,max_cur,max_vol,theta,voltage);
	}
	
	public boolean crash(){
		if(getRealPosition().getZ()<=0){
			System.out.println("The airplane is crashing!");
			return true;
		}
		return false;
	}
	
	public boolean stall(){
		if(getRealVelocity().getX()<1 || getRealVelocity().getY()<1 || getRealVelocity().getZ()<1){
			System.out.println("The velocity is too slow and the airplan would stall!");
			return true;
		}
		return false;
	}
	
	public void move(Vector speed){
		if(stall() || crash()){
			System.out.println("Modify the velocity immediately!");
		}else{
			Vector now=getRealPosition();
			now.add(speed);
			setRealPosition(now);
		}
	}
	
	public void pitch(Angle angle, double degree) {
		this.angle=angle;
		this.degree=degree;
	}

	
	public void stop() {
		setRealVelocity(new Vector(0,0,0));
	}
}

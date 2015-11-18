package edu.stevens.robosim;


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
	
	public void move(Vector speed){
		Vector now=getRealPosition();
		 now.add(speed);
		setRealPosition(now);
	}
	
	@Override
	public void pitch(Angle angle, double degree) {
		// TODO Auto-generated method stub
		this.angle=angle;
		this.degree=degree;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		setRealVelocity(new Vector(0,0,0));
	}
}

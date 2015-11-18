package edu.stevens.robosim;


public class Airplane extends Robot{
	
	
	public Airplane(Vector realposition, Vector realvelocity, Vector imageposition, Vector imagevelocity, double mass,
			double batter_life, double max_cur, double max_vol, double theta,double voltage){
		super(realposition,realvelocity,imageposition,imagevelocity,mass,batter_life,max_cur,max_vol,theta,voltage);
	}
	
//	public void move(float i,float j,float m,float time){
//		try{
//		x-=i;y-=j;z-=m;this.time-=time;
//		Thread.sleep(500);
//		}catch(Exception e)
//		{e.printStackTrace();}
//	}
	
	
//	public static void main(String[] args) throws Exception{
//		Airplane robot=new Airplane(100,100,100,20);
//		while(x>0 && y>0 && z>0 && time>=0){
//			robot.move(10, 10, 10, 3);
//			System.out.println("The airplane position is: "+x+","+y+","+z);
//		}
//	}

	@Override
	public void pitch(Angle angle, double degree) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}

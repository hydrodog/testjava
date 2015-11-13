package edu.stevens.robosim;

public class Airplane{
	
	private static float x,y,z,vx,vy,vz,time;
	
	Airplane(float x,float y,float z,float time){
		this.x=x;this.y=y;this.z=z;this.time=time;
	}
	public void move(float i,float j,float m,float time){
		try{
		x-=i;y-=j;z-=m;this.time-=time;
		Thread.sleep(500);
		}catch(Exception e)
		{e.printStackTrace();}
	}
	public static void main(String[] args) throws Exception{
		Airplane robot=new Airplane(100,100,100,20);
		while(x>0 && y>0 && z>0 && time>=0){
			robot.move(10, 10, 10, 3);
			System.out.println("The airplane position is: "+x+","+y+","+z);
		}
	}
}

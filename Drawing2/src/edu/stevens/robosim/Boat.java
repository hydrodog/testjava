package edu.stevens.robosim;

public abstract class Boat extends Environment{
	class Depth extends Environment{
	public Depth(double waterdepth, double waterspeed, double landheight){
	super();
	}
}
	double Bdisplacement, Btime, Bspeed;
	public void BoatAccleration(double displacement, double time){
		
		Bspeed = displacement * 100 / Btime;
		
		if (Bdisplacement>Btime){
			System.out.println("Boat is in Accelerate mode");
		}
		else if(Bdisplacement<time) {
			
		}
	}
	
	
	
	
}




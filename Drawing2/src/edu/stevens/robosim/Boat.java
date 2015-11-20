package edu.stevens.robosim;
/**
 * 
 * @author Shrikant Limaye
 * @author Nishil Parikh
 * @author Sushmita De
 *
 */
public abstract class Boat extends Environment{
	class Depth extends Environment{
	public Depth(double waterdepth, double waterspeed, double landheight, double boatHeight, double boatDepthSubmerged){
	super();
	}
}
	double Bdisplacement, Btime, Bspeed;
	public void BoatAccleration(double Bdisplacement, double Btime){
		
		Bspeed = Bdisplacement * 100 / Btime;
		
		if (Bdisplacement>Btime){ // boat will accelerate if displacement is greater than time
			System.out.println("Boat is in Accelerate mode");
			Bspeed += Bdisplacement;
		}
		else if(Bdisplacement<Btime) { // boat will decelerate if displacement is less than time
			System.out.println("Boat is in Decelerate mode");
			Bspeed -= Bdisplacement;
		}
		
	}
	
	private double getBoatHeight() {
		return 0;
}

	public double getBoatDepthSubmerged(){
		return 0;
	}
	public boolean positiveBuoyancy() {
	//Condition: The boat can float only if it is submerged up to a depth of 30-70%
		if(getLandheight()<getWaterdepth()&& (getBoatDepthSubmerged() <= 0.7*getBoatHeight() || getBoatDepthSubmerged() >= 0.3*getBoatHeight())){
			System.out.println("The boat is in motion");
			return true;
		}
		return false;
	}

	public void stop() {
	//Condition: If land height is greater than or equal to the water depth, the boat will stop
		if(getLandheight(Bdisplacement)>= getWaterdepth(Bdisplacement)){
			System.out.println("The boat is not in motion");
		}
	}
	public void sink(){
	//Condition: The boat will sink if it is submerged more than 70% of its height
		if(getBoatDepthSubmerged() >= 0.7*getBoatHeight()){
			System.out.println("Help! The boat is sinking!");
		}
	}
	
	// trying to give direction to boat
	public class direction extends Compass
	{

		private double v;

		direction(Vector v) {
			super(v);
	
		
	
}
		
	}
	}




package edu.stevens.robosim;
import java.util.ArrayList;
import java.util.Random;

public class Environment {
	private double x;
	private double y;
	private double z;
	private int n;
	private static Random r = new Random();
    public static int dieRoll() { return r.nextInt(6) + 1; }
	private double landheight;
	private double waterdepth;
	private double waterspeed;
	private double airspeed;
	private double airdirection;	
	public double getX(){ return 0;}
	public double getY(){ return 0;}
	public double getZ(){ return 0;}
	public double getLandheight(){ return 0;}
	public double getWaterdepth(){ return 0;}
	public double getWaterspeed(){ return 0;}
	public double getAirspeed(){ return 0;}
	public double getAirdirection(){ return 0;}
    public Environment(){
    	ArrayList<Grid> map = new ArrayList<Grid>();
    	for (int i = 0; i < n ; i++)
    		map.add(new Grid(10.0, 10.0));
    }
}
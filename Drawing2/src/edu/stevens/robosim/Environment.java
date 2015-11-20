package edu.stevens.robosim;
/**
 * 
 * @author Bo Liu
 * @author Zhicheng Yan
 * @author Juncheng Li
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class Environment {
	private double sizeX;
	private double sizeY;
	private double sizeZ;
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
	public double getLandheight(double lh){ return lh;}
	public double getWaterdepth(double wd){ return wd;}
	public double getWaterspeed(double ws){ return ws;}
	public double getAirspeed(double as){ return as;}
	public double getAirdirection(double ar){ return ar;}
    public Environment(){
    	ArrayList<Grid> map = new ArrayList<Grid>();
    	for (int i = 0; i < n ; i++)
    		map.add(new Grid(10.0, 10.0));
    }
}
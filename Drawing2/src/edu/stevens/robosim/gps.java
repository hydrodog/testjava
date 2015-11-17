package edu.stevens.robosim;
import java.util.Vector;


public abstract class gps {



	private PositionRadians lat, lon, true position, gaussian error, estimate position, sigma, y, a;
	y = math.sqrt(2*3.14);
	a= 1/y*sigma;
	gaussian error=
	
	public Position() {
		this(0,0);
	}
	public Position(double la, double lo) {
		lat = new PositionRadians(la);
		lon = new PositionRadians(lo);
	}
	
	
	public Position(IPosition pos) {
		lat = pos.getLatitude();
		lon = pos.getLongitude();
	}
	
	
	
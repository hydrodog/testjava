package edu.stevens.robosim;
import java.util.Vector;


public abstract class gps {



	private PositionRadians lat, lon, true position, gaussian_error, estimate position, sigma,x, y, a;
	y = math.sqrt(2*3.14);
	a= 1/y*sigma;
	gaussian_error=a*Math.exp(-x*x/(2*sigma*sigma));
	
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
	true possition= lat+lon;
	
	estimate position= true position+gaussian_error;
	
	
}
}
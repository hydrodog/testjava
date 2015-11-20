//Author: Chris Coyle
//Reference: http://commons.apache.org/proper/commons-math/apidocs/org/apache/commons/math3/distribution/NormalDistribution.html


package edu.stevens.robosim;

import org.apache.commons.math3.distribution.AbstractRealDistribution;
import org.apache.commons.math3.distribution.NormalDistribution ;


public class GPSsensor {
	
	
private	double realLat, realLon, sigma;  


public GPSsensor (double x, double y, double sig){
	
	realLat = x ; realLon = y ; sigma = sig;
	
	
}


double getLat(){
	NormalDistribution n = new NormalDistribution(realLat, sigma);
	
	return n.sample;
	
	n = null;
}

double getLon(){
	
	NormalDistribution n = new NormalDistribution(realLon, sigma);
	
	return n.sample;
	

	n = null;
}




}

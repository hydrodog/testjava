package edu.stevens.robosim;

public class EnviroMonitor {
	public static int getEnviroment(Environment e){
		if(e=="land")
			return 1;
		else 
			if(e=="water")
				return 2;
			else(e=="air")
			return 3;
	}
}

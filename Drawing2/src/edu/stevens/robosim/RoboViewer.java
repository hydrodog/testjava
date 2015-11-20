package edu.stevens.robosim;
/* @author: Srushti
 * @author: Harish
 * It will indicate position of all robots
 */

import java.awt.Graphics;

import javax.swing.JPanel;

public class RoboViewer  {
	
		public void draw(Graphics g) {
			Vector v= null;
			double x=v.getX();
			double y=v.getY();
			g.drawOval((int)x,(int)y,10,10);// will draw the position
		}
}


package edu.stevens.robosim;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class RoboViewer  {
	
		private int startX,startY,endX,endY;
		private ArrayList arraylst;
		public void draw(Graphics g) {
			g.drawOval(x,y,10,10);
		}
}|


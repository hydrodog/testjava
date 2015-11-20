import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Currency;

public class DrawArea extends JPanel {
	private ArrayList<Shape> drawList; // starts as null
	private int startX, startY, endX, endY;
	public DrawArea() {
		drawList = new ArrayList<Shape>(10000);	
	//	drawList.add(new Circle(100,200,50));
	//	drawList.add(new Circle(400,300,50));
	//	drawList.add(new Circle(600,200,50));
		drawList.add(new Line(100, 100, 200, 200));
		drawList.add(new Line(400, 150, 700, 150));
		
		
		addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				int endX = e.getX(), endY = e.getY();
				
				drawList.add(new Line( startX, startY, endX, endY));
					repaint();
				

			}
			public void mousePressed(MouseEvent e) {
				endX = startX = e.getX(); endY = startY = e.getY();

				
			}
			
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}
			
			public void mouseClicked(MouseEvent e) {
			}
		});
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {
			}
			public void mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.setXORMode(Color.WHITE);
				g.drawLine( startX, startY, endX, endY);

				endX = e.getX(); endY = e.getY();
				g.drawLine( startX, startY, endX, endY);
				
			}
		});
	}
		


	public void paint(Graphics g) {
		for (int i = 0; i < drawList.size(); i++) {
			Shape s = drawList.get(i);
			s.draw(g);
		}
			
	}
}

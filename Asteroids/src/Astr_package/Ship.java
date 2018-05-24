package Astr_package;

import java.awt.Rectangle;
import java.awt.Polygon; 

//this class inherits all public methods and properties of the VectorShape class
public class Ship extends VectorShape{

	//define ship polygon
	private int[] shipX = {-6, -3, 0, 3, 6, 0};
	private int[] shipY = {6, 7, 7, 7, 6, -7};
	
	//defines game boundary 
	public Rectangle getBounds() {
		Rectangle r;
		r = new Rectangle((int)getX() -6, (int) getY() - 6, 12, 12);
		return r; 
	}
	
	//ship constructor
	public Ship(){
		setShape(new Polygon(shipX, shipY, shipX.length));
		setIsAlive(true); 
	}
}

package Astr_package;

import java.awt.Polygon;
import java.awt.Rectangle;

//inherits all public methods and properties from VectorShape 
public class Asteroid extends VectorShape{
	
	//define asteroid shape
	private int[] astX = {-20,-13, 0, 20, 22, 20, 12, 2, -10, -22, -16};
	private int[] astY = {20, 23, 17, 20, 16, -20, -22, -14, -17, -20, -5};
	
	// rotation velocity variable declaration
	protected double rotVel;
	
	// Accessing rotational velocity data method
	public double getRotationalVelocity(){
		return rotVel;
	}

	// help and mutator of rotational velocity method
	public void setRotationalVelocity(double v){
		rotVel = v;
	}
	
	//define boundaries
	public Rectangle getBounds() {
		Rectangle r;
		r = new Rectangle((int)getX() -20, (int) getY() -20, 40, 40);
		return r; 
	}
	
	//default constructor
	public Asteroid(){
		setShape(new Polygon(astX,astY, astX.length));
		setIsAlive(true);
		setRotationalVelocity(0.0);
	}
}

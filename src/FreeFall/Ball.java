package FreeFall;

public class Ball {
	private double x;
	private double y;
		
	public Ball(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void changeLocation() {
		Launch.velocity = Launch.velocity-Launch.a/100.0;
		Launch.vX = Launch.velocity*Math.cos(Launch.theta*Math.PI/180);
		Launch.vY = Launch.velocity*Math.sin(Launch.theta*Math.PI/180);		
		this.setX(this.x+Launch.vX/100.0);
		this.setY(this.y+Launch.vY/100.0);

	}
	
	public boolean isOffX() {
		if ((this.x+Launch.vX/100.0 < 0)||(this.x+Launch.vX/100.0 > Canvas.width)) return true;
		return false;
	}
	
	public boolean isOffY() {
		if ((this.y+Launch.vY/100.0 < 0)||(this.y+Launch.vY/100.0 > Canvas.height)) return true;
		return false;
	}
}

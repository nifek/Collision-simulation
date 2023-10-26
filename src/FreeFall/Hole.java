package FreeFall;

public class Hole {
	private double x;
	private double y;
	private double R;
		
	public Hole(double x, double y) {
		this.x = x;
		this.y = y;
		this.R = 1;
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
	
	public double getR() {
		return this.R;
	}
	
	public boolean isIn() {
		if(Math.sqrt(Math.pow((Launch.ball.getX()-x), 2) + Math.pow((Launch.ball.getY()-y), 2)) < R + 1) return true;
		return false;
	}
}
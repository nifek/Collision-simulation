package FreeFall;

public class Launch {
	
	static final double a = 6.38289194251;
	static Ball ball = new Ball(10, 0);
	static Hole hole = new Hole(Math.random()*Canvas.width, Math.random()*Canvas.height);
	static double velocity = 100;
	static double theta = Math.random()*360-1800;
	static double vX;
	static double vY;
	static double time = 0;

	public static void main(String[] args) throws Exception {
		while((velocity >= 0)&&(!hole.isIn())) {
			if(ball.isOffX()) theta = 180-theta;
			if(ball.isOffY()) theta = -theta;
			Launch.ball.changeLocation();
			Canvas.drawPicture();
			Thread.sleep(50);
		    time+=0.01;
			System.out.println("x: " + ball.getX());
			System.out.println("y: " + ball.getY());
			System.out.println("d: " + Math.sqrt(Math.pow((Launch.ball.getX()-hole.getX()), 2) + Math.pow((Launch.ball.getY()-hole.getY()), 2)));
			System.out.println("velocity: " + velocity);
		}
		for(int[] a : Canvas.matrix) {
			for(int b : a) System.out.print(b);
			System.out.println();
		}
	}
}

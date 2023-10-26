package FreeFall;

public class Canvas {
	
	static int width = 50;
	static int height = 25;
	static int[][] matrix = new int[height][width];
	
	static {
		for(int a = 0; a != height; a++) for(int b = 0; b != width; b++) matrix[a][b] = 0;
	}
	
	static void drawPicture() {
		for(long a = 0; a != height; a++) {
			for(long b = 0; b != width; b++) {
				if ((a == height - Math.round(Launch.hole.getY()))&&(b == Math.round(Launch.hole.getX()))) System.out.print("00");
				else if ((a == height - Math.round(Launch.ball.getY()))&&(b == Math.round(Launch.ball.getX()))) {
					System.out.print("AA");
					matrix[(int)a][(int)b] = 1;
				}
				else if (a == height-1) System.out.print("——");
				else if (a == 0) System.out.print("——");
				else if (b == width-1) System.out.print("|");
				else if (matrix[(int)a][(int)b] == 1) System.out.print("..");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
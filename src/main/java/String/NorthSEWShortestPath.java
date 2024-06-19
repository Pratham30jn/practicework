package String;

public class NorthSEWShortestPath {
	//Route containing 4 directions(E,W,S,N) find shortest path to reach destination.
	public static float getShortestPath(String path) {
		int x=0; int y=0;
		for(int i=0;i<path.length();i++) {
			//south
			if(path.charAt(i)=='S') {
				y--;
			}else if(path.charAt(i)=='N') {
				y++;
			}else if(path.charAt(i)=='E') {
				x++;
			}else if(path.charAt(i)=='W') {
				x--;
			}
		}
	int	X=x*x;
	int Y=y*y;
	return (float)Math.sqrt(X+Y);
	}
	public static void main(String[] args) {
		String path="WNEENESENNN";
		System.out.println("Shortest path in Km is-:"+getShortestPath(path));
	}

}

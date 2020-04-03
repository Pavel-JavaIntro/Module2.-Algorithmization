package by.pavka.algorithmization.decomposition;

/*
 * На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив
 */
public class Task4 {

	public static void main(String[] args) {
		Point[] points = new Point[]{new Point(4, -9), new Point(23, 23), new Point(-15, 0), new Point(5, 5)};
		int[] ps = getFarthest(points);
		System.out.println("The farthest points are " + ps[0] + " and " + ps[1]);
	}
	
	public static int[] getFarthest(Point[] points) {
		int length = points.length;
		double distance = 0;
		int first = 0;
		int second = 0;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(distance(points[i], points[j]) > distance){
					distance = distance(points[i], points[j]);
					first = i;
					second = j;
				}
			}
		}
		return new int[] {first, second};
	}
	
	public static double distance(Point a, Point b) {
		double xDistance = b.x - a.x;
		double yDistance = b.y - a.y;
		return Math.sqrt(Math.pow(xDistance,  2) + Math.pow(yDistance,  2));
	}
	
	
	static class Point {
		double x;
		double y;
		
		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

}

package by.pavka.algorithmization.decomposition;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y— прямой
 */
public class Task9 {

	public static void main(String[] args) {
		System.out.println(triangleArea(5, 1, 5));
		System.out.println(quadrangleArea(3, 3, 1, 4));

	}
	
	public static double quadrangleArea(double x, double y, double z, double t) {
		
		double hyp = Math.sqrt(x * x + y * y);
		
		double rect = semiRectangleArea(x, y);
		double tr = triangleArea(hyp, z, t);
		if(tr == -1) {
			System.out.println("The quadrangle does not exist)");
			return -1;
		}
		return rect + tr;
	}
	
	public static double semiRectangleArea(double x, double y) {
		return (x * y) / 2;
	}
	public static double triangleArea(double a, double b, double c) {
		if((b + c) < a || (a + b) < c || (a + c) < b) {
			System.out.println("The triangle does not exist");
			return -1;
		}
		double p = (a + b + c) / 2;
		//Heron's formula
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}

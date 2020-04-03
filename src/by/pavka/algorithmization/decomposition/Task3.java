package by.pavka.algorithmization.decomposition;

/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника
 */
public class Task3 {

	public static void main(String[] args) {
		System.out.println(hexagonArea(1));

	}
	public static double hexagonArea(double side) {
		return triangleArea(side) * 6;
	}
	
	public static double triangleArea(double side) {
		return side * side * Math.sqrt(3) / 4;
	}

}

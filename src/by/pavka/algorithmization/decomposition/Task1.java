package by.pavka.algorithmization.decomposition;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел
 */
public class Task1 {

	public static void main(String[] args) {
		System.out.println(findGCD(14, 24));
		System.out.println(findLCM(14, 24));
	}
	
	//Greatest Common Divisor
	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		return b == 0? a : findGCD(b, a % b);
	}
	
	//Least Common Multiple
	public static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

}

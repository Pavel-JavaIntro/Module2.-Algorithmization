package by.pavka.algorithmization.decomposition;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */
public class Task2 {

	public static void main(String[] args) {
		System.out.println(find4GCD(96, 84, 96, 56));

	}
	
	public static int find4GCD(int a, int b, int c, int d) {
		int gcd1 = findGCD(a, b);
		int gcd2 = findGCD(c, d);
		return findGCD(gcd1, gcd2);
	}
	
	public static int findGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		return b == 0? a : findGCD(b, a % b);
	}

}

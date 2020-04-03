package by.pavka.algorithmization.decomposition;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {

	public static void main(String[] args) {
		System.out.println(mutualSimple(2, 9, 8));

	}
	
	public static boolean mutualSimple(int a, int b, int c) {
		int min = min(a, b, c);
		for(int i = 2; i <= min; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0) return false;
		}
		return true;
	}
	
	public static int min(int a, int b, int c) {
		if(a <= b && a <= c) return a;
		if(b <= a && b <= c) return b;
		return c;
	}

}

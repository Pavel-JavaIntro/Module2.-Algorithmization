package by.pavka.algorithmization.decomposition;

/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
 */
public class Task7 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(sumFactorial(9));

	}
	
	public static long sumFactorial(int a) {
		long sum = 0;
		for(int i = 1; i <= a; i = i + 2) {
			sum += factorial(i);
		}
		return sum;
	}
	
	public static long factorial(int a) {
		if(a == 0 || a == 1) return 1;
		return a * factorial(a - 1);
	}

}

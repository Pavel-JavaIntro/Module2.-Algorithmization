package by.pavka.algorithmization.decomposition;

/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
 */
public class Task16 {

	public static void main(String[] args) {
		//System.out.println(countEvens(1));
		checkSum(1531, 1991);
	}
	
	//This method solves the task
	public static int checkSum(int a, int b) {
		if(length(a) != length(b) || countEvens(a) > 0 || countEvens(b) > 0) {
			System.out.println("Wrong args");
			return -1;
		}
		int result = countEvens(a + b);
		System.out.println((a + b) + " has " + result + " even figures");
		return result;
	}
	//The method calculates number of even figures
	private static int countEvens(int n) {
		n = Math.abs(n);
		if(n < 10) {
			return n % 2 == 0? 1 : 0;
		}
		int evens = 0;
		while(n / 10 > 0) {
			int a = n % 10;
			if(a % 2 == 0) {
				evens++;
			}
			n /= 10;
		}
		return evens;
	}
	
	//This method calculates number of digits in an integer k
	  private static int length(int k) {
	      k = Math.abs(k);
	      int length = 1;
	      while(k / 10 > 0) {
	          length++;
	          k = k / 10;
	      }
	      return length;
	  }

}

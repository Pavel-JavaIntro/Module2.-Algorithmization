package by.pavka.algorithmization.decomposition;
/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, 
 * равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию
 */
public class Task14 {

	public static void main(String[] args) {
		System.out.println(sumOfPoweredDigits(21, 2));
		printArmstrongs(155);
	}
	
	public static void printArmstrongs(int k) {
		for(int i = 1; i <=k; i++) {
			
			int power = getLength(i);
			int sum = sumOfPoweredDigits(i, power);
			if(sum == i) {
				System.out.println("Armstrong number: " + i);
			}
		}
	}
	
	//This method returns the length of the number
	private static int getLength(int num) {
		int length = 1;
		while(num / 10 > 0) {
			length++;
			num /= 10;
		}
		return length;
	}
	
	//This method calculates sum of figures in a number in k power
	private static int sumOfPoweredDigits(int number, int k) {
        number = Math.abs(number);
        if(number < 10) return number;

        int sum = 0;
        do {
            sum += Math.pow(number % 10, k);
            number /= 10;
        }
        while(number / 10 > 0);
        sum += Math.pow(number, k);

        return sum;
    }


}

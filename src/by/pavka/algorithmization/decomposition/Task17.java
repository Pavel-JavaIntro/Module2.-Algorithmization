package by.pavka.algorithmization.decomposition;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */
public class Task17 {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(50));
		cycle(123);
	}
	
	//This method solves the task
	public static int cycle(int num) {
		num = Math.abs(num);
		if(num == 0) return 0;
		
		int cycles = 1;
		while(num - sumOfDigits(num) > 0) {
			cycles++;
			num -= sumOfDigits(num);
		}
		System.out.println(cycles + " cycles");
		return cycles;
	}
	
	private static int sumOfDigits(int num) {
		num = Math.abs(num);
		if(num < 10) return num;
		
		int sum = 0;
		while(num / 10 > 0) {
			sum += num % 10;
			num /= 10;
		}
		sum += num;
		return sum;
	}

}

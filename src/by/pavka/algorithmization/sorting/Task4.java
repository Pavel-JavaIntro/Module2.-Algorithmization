package by.pavka.algorithmization.sorting;

import java.util.Arrays;

/*
 * Сортировка обменами. Дана последовательность чисел a1  a2  an .
 * 
 * Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа i i+1 a и a . 
 * Если ai  ai+1 , то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок
 */
public class Task4 {

	public static void main(String[] args) {
		int[] arr3 = {6, 7, 0, 3, 2, 9, 9, 3, 0, 1};
		sortByExchange(arr3);
	}
	
	//This method sorts the array be exchange
		public static int[] sortByExchange(int[] arr) {
			int exchange;
			do {
				exchange = 0;
				int temp;
				for(int i = 0; i < arr.length - 1; i++) {
					if(arr[i] > arr[i + 1]) {
						temp = arr[i + 1];
						arr[i + 1] = arr[i];
						arr[i] = temp;
						exchange++;
					}
				}
				
			}
			while(exchange != 0);
			System.out.println(Arrays.toString(arr));
			return arr;
		}
		

}

package by.pavka.algorithmization.decomposition;

import by.pavka.algorithmization.util.Helper;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m
 */
public class Task8 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		sum3(arr);

	}
	
	public static int[] sum3(int[] arr) {
		int[] result = new int[arr.length - 2];
		for(int i = 0; i < arr.length - 2; i++) {
			result[i] = sum(arr, i);
		}
		Helper.printArray(result);
		return result;
	}
	
	public static int sum(int[] arr, int start) {
		int result = 0;
		if(start + 2 < arr.length) {
			result = arr[start] + arr[start + 1] + arr[start + 2];
		}
		else {
			System.out.println("The array is short");
		}
		return result;
	}

}

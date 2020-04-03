package by.pavka.algorithmization.sorting;

import java.util.Arrays;

/*
 * Сортировка выбором. Дана последовательность чисел a1  a2  an .
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
 * а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором
 */
public class Task3 {

	public static void main(String[] args) {
		int[] arr3 = {6, 7, 0, 3, 2, 9, 9, 3, 0, 1};
		sortBySelection(arr3);
	}
	
	//This method sorts the array by selection
		public static int[] sortBySelection(int[]arr) {
			for(int i = 0; i < arr.length - 1; i++) {
				int max = arr[i];
				int index = i;
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[j] > max) {
						max = arr[j];
						index = j;
					}
				}
				arr[index] = arr[i];
				arr[i] = max;
			}
			System.out.println(Arrays.toString(arr));
			return arr;
		}
		

}

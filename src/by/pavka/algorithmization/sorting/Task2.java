package by.pavka.algorithmization.sorting;

import java.util.Arrays;

/*
 * Даны две последовательности a1  a2  an и b1  b2  bm . 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать
 */
public class Task2 {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 1, 2, 2, 3, 4, 5, 5, 9, 9};
		int[] arr2 = {0, 3, 6, 7};
		combineArrays(arr1, arr2);

	}
	
	//This methods combines two non-descending arrays into one
		public static int[] combineArrays(int[] arr1, int[] arr2) {
			int[] result = new int[arr1.length + arr2.length];
			int i = 0;
			int j = 0;
			int k = 0;
			while(i < arr1.length && j < arr2.length) {
				if(arr1[i] < arr2[j]) {
					result[k++] = arr1[i++];
				}
				else {
					result[k++] = arr2[j++];
				}
			}
			if(j == arr2.length) {
				for(int index = i; index < arr1.length; index++) {
					result[k++] = arr1[index];
				}
			}
			else {
				for(int index = j; index < arr2.length; index++) {
					result[k++] = arr2[index];
				}
			}
			System.out.println(Arrays.toString(result));
			return result;
		}
		

}

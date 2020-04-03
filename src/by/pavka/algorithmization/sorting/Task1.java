package by.pavka.algorithmization.sorting;

import java.util.Arrays;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив, 
 * включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив
 */
public class Task1 {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 1, 2, 2, 3, 4, 5, 5, 9, 9};
		int[] arr2 = {0, 3, 6, 7};
		insertArray(arr1, arr2, 3);
	}
	
	//This method inserts the second array into the first one starting for k-position
		public static int[] insertArray(int[] first, int[] second, int k) {
			int[] result = new int[first.length + second.length];
			for(int i = 0; i < k + 1; i++) {
				result[i] = first[i];
			}
			int start = k + 1;
			for(int i = 0; i < second.length; i++) {
				result[start + i] = second[i];
			}
			start = second.length;
			for(int i = k + 1; i < first.length; i++) {
				result[start + i] = first[i];
			}
			System.out.println(Arrays.toString(result));
			return result;
		}
		
		

}

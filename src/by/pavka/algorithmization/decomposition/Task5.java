package by.pavka.algorithmization.decomposition;

import java.util.Arrays;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
 * которое меньше максимального элемента массива, но больше всех других элементов)
 */
public class Task5 {

	public static void main(String[] args) {
		int[] arr = {8, 0, 8, -2, 1, 1, 6};
		//sortBySelection(arr);
		System.out.println(findSecond(arr));
	}
	
	public static int findSecond(int[] arr) {
		int[] result = sortBySelection(arr);
		
		for(int i = 1; i < result.length; i++) {
			if(result[i] < result[0]) {
				return result[i];
			}
			
		}
		System.out.println("All values are equal");
		return result[0];
	}
	
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

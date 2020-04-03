package by.pavka.algorithmization.sorting;

import java.util.Arrays;

/*
 * Пусть даны две неубывающие последовательности действительных чисел a1  a2  an и b1  b2  bm . 
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1  b2  bm в первую последовательность так, 
 * чтобы новая последовательность оставалась возрастающей
 */
public class Task7 {

	public static void main(String[] args) {
		int[] arr2 = {0, 3, 6, 7};
		int[] arr3 = {6, 7, 7, 8, 9, 9, 9, 13, 20, 21};
		findAndInsert(arr3, 9, 4);
		insertArray(arr3, arr2);
	}
	//This method solves the task
	public static int[] insertArray(int[] target, int[] shrapnel) {
		System.out.println("Target: " + Arrays.toString(target));
		System.out.println("Shrapnel " + Arrays.toString(shrapnel));
		int[] hits = new int[shrapnel.length];
		int[] result = new int[target.length + shrapnel.length];
		for(int i= 0; i < target.length; i++) {
			result[i] = target[i];
		}
		int index = target.length;
		for(int i = 0; i < shrapnel.length; i++) {
			hits[i] = findAndInsert(result, index++, shrapnel[i]);
		}
		System.out.println("Result: " + Arrays.toString(result));
		System.out.println("Insert indices: " + Arrays.toString(hits));
		return hits;
	}
	
	//This auxiliary method finds place and inserts integer into non-descending array
		private static int findAndInsert(int[] arr, int endIndex, int value) {
			int insert = searchIndex(arr, 0, endIndex, value);
			for(int j = endIndex; j > insert; j--) {
				arr[j] = arr[j - 1];
			}
			arr[insert] = value;
			
			return insert;
		}
		//This auxiliary method implements a binary search in a sub-array(startIndex until endIndex)
		private static int searchIndex(int[] arr, int startIndex, int endIndex, int value) {
		
			int start = startIndex;
			int end = endIndex;
			
			if(end - start < 2) {
				if(value < arr[end - 1]) return start;
				return end;
			}
			else {
				int mid = (start + end) / 2;
				if(value == arr[mid]) {
					return mid;
				}
				if(value > arr[mid]) {
					return searchIndex(arr, mid, end, value);
				}
				else {
					return searchIndex(arr, start, mid, value);
				}
			}
			
		}
		
}

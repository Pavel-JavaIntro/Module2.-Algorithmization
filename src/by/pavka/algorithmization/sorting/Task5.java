package by.pavka.algorithmization.sorting;

import java.util.Arrays;

/*
 * Сортировка вставками. Дана последовательность чисел n a ,a , ,a 1 2  . Требуется переставить числа в порядке возрастания. 
 * Делается это следующим образом. Пусть a a ai , , , 1 2  - упорядоченная последовательность, т. е. a1  a2  an . 
 * Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны. 
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. 
 * Двоичный поиск оформить в виде отдельной функции. 
 */
public class Task5 {

	public static void main(String[] args) {
		int[] arr3 = {6, 7, 0, 3, 2, 9, 9, 3, 0, 1};
		System.out.println(searchIndex(arr3, 0, arr3.length, 11));
		sortByInsert(arr3);

	}
	
	//This method sorts the array by inserts
		public static int[] sortByInsert(int[] arr) {
			System.out.println(Arrays.toString(arr));
			int[] result = new int[arr.length];
			result[0] = arr[0];
			int index = 1;
			int insert;
			for(int i = 1; i < arr.length; i++) {
				insert = searchIndex(result, 0, index, arr[i]);
				if(insert == index) {
					result[index++] = arr[i];
				}
				else {
					for(int j = index++; j > insert; j--) {
						result[j] = result[j - 1];
					}
					result[insert] = arr[i];
				}
			}
			System.out.println(Arrays.toString(result));
			return result;
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

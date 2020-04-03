package by.pavka.algorithmization.sorting;

import java.util.Arrays;

import by.pavka.algorithmization.util.Helper;

/*
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. 
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . 
 * Если ai  ai+1 , то продвигаются на один элемент вперед. 
 * Если ai  ai+1 , то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Task6 {

	public static void main(String[] args) {
		int[] arr3 = {6, 7, 0, 3, 2, 9, 9, 3, 0, 1};
		sortByShell(arr3);

	}
	
	//This method implements Shell sorting algorithm
		public static int[] sortByShell(int[]arr) {
			int index = 0;
			while(index < arr.length - 1) {
				if(arr[index] <= arr[index + 1]) index++;
				else {
					int temp = arr[index + 1];
					arr[index + 1] = arr[index];
					arr[index] = temp;
					if(index > 0) index--;
				}
			}
			Helper.printArray(arr);;
			return arr;
		}
		

}

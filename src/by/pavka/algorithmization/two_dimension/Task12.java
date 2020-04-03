package by.pavka.algorithmization.two_dimension;

import java.util.Arrays;

/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Task12 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};
		sortRows(intArray, true);
	}
	
	//This method sorts rows
    public static void sortRows(int[][] array, boolean descend) {
        for(int i = 0; i < array.length; i++) {
            sort(array[i]);
            if(descend) {
                for(int j = 0, k = array[i].length - 1; j < k; j++, k--) {
                    int t = array[i][j];
                    array[i][j] = array[i][k];
                    array[i][k] = t;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
    
  //This auxiliary method sorts arrays
    private static void sort(int[] arr) {
    	for(int i = arr.length - 1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
               
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}

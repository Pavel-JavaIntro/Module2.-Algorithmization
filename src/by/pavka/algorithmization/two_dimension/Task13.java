package by.pavka.algorithmization.two_dimension;

import java.util.Arrays;

/*
 * Отсортировать стобцы матрицы по возрастанию и убыванию значений эементов
 */
public class Task13 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};
		sortColumns(intArray, false);
	}
	
	//This method sorts columns
    public static void sortColumns(int[][] array, boolean descend) {
        for(int j = 0; j < array[0].length; j++) {
            int[] t = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                t[i] = array[i][j];
            }
            sort(t);

            if(descend) {
                for(int i = 0; i < array.length; i++) {
                    array[i][j] = t[array.length - 1 - i];
                }
            }
            else {
                for(int i = 0; i < array.length; i++) {
                    array[i][j] = t[i];
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
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

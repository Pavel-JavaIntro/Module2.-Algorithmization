package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы
 */
public class Task10 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};
		Helper.printArray(selectPositive(intArray));

	}
	
	//This method select positive elements of the main diagonal
    public static int[] selectPositive(int[][] array) {
    	int size = 0;
    	for(int i = 0; i < array.length; i++) {
    		if(array[i][i] > 0) size++;
    	}
        int[] positive = new int[size];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i][i] > 0) {
            	positive[index++] = array[i][i];
            }
        }
        return positive;
    }


}

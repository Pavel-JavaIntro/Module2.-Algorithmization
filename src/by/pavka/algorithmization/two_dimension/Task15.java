package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};
		findMaxAndReplace(intArray);
		Helper.printMatrix(intArray);
	}
	
	//This method finds the max value in the array and replaces all add elements with it
    public static void findMaxAndReplace(int[][] array) {
        int max = array[0][0];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] > max) max = array[i][j];
            }
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] %2 == 1) array[i][j] = max;
            }
        }
    }

}

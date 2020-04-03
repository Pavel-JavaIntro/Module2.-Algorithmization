package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task5 {

	public static void main(String[] args) {
		int[][] array2 = generateMatrix2(4);
		Helper.printMatrix(array2);

	}
	
	//This method generates a square matrix following the template in the task 5
    public static int[][] generateMatrix2(int n) {
        int[][] array = new int[n][n];

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j++) {
                array[i][j] = i+1;
            }
        }
        return array;
    }

}

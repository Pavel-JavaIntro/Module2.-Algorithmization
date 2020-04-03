package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Task4 {

	public static void main(String[] args) {
		int[][] array = generateMatrix1(4);
		Helper.printMatrix(array);

	}

	//This method generates a square matrix following the template in the task 4
    public static int[][] generateMatrix1(int n) {
        int[][] array = new int[n][n];

        for(int i = 1; i < n; i += 2) {
            int element = 1;
            for(int j = 0; j < n; j++) {
                array[i-1][j] = element;
                array[i][j] = n + 1 - element++;
            }
        }
        return array;
    }
}

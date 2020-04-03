package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;
/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task6 {

	public static void main(String[] args) {
		int[][] array3 = generateMatrix3(6);
		Helper.printMatrix(array3);

	}
	//This method generates a square matrix following the template in the task 6
    public static int[][] generateMatrix3(int n) {
        int[][] array = new int[n][n];

        for(int i = 0; i < n/2; i ++) {
            for(int j = 0; j < n; j++) {
                if(j < i || n - 1 - j < i) {
                    array[i][j] = 0;
                    array[n - 1 - i][j] = 0;
                }
                else {
                    array[i][j] = 1;
                    array[n - 1 - i][j] = 1;
                }
            }
        }
        return array;
    }

}

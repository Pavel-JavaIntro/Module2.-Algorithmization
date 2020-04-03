package by.pavka.algorithmization.two_dimension;

import java.util.Arrays;
import java.util.Random;

/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца
 */
public class Task14 {

	public static void main(String[] args) {
		formMatrix(5, 4);

	}
	
	//This method generates a random matrix of 0 and 1 when number of 1's in the column equals number of column
    public static int[][] formMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        Random random = new Random();
        for(int j = 1; j < n; j++) {
            int count = j;
            while(count > 0) {
                int pos = random.nextInt(m);
                if(matrix[pos][j] == 0) {
                    matrix[pos][j] = 1;
                    count--;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }


}

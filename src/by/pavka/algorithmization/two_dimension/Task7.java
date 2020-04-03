package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Сформировать квадратную матрицу порядка N по правилу: task7 
 * и подсчитать количество положительных элементов в ней.
 */
public class Task7 {

	public static void main(String[] args) {
		double[][] doubleArray = generateMatrix4(6);
		Helper.printMatrix(doubleArray);

	}
	
	//This method generates a square matrix following the template in the task 7 and prints number of positive elements
    public static double[][] generateMatrix4(int n) {
        double[][] array = new double[n][n];
        int positive = 0;

        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j++) {
                array[i][j] = Math.sin((i*i - j*j) / (n + 0.0));
                if(array[i][j] > 0) positive++;
            }
        }
        System.out.println("Number of positive elements: " + positive);
        return array;
    }

}

package by.pavka.algorithmization.two_dimension;
/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму
 */
public class Task9 {

	public static void main(String[] args) {
		double[][]dArray = {{1.1, 2.54, 3},{0, -6.1, 55},{4, 4.0, 0.9}};
		maxSum(dArray);

	}
	
	public static int maxSum(double[][] array) {
        double[] sums = new double[array[0].length];
        for(int j = 0; j < array[0].length; j++) {
            double sum = 0;
            for(int i = 0; i < array.length; i++) {
                sum += array[i][j];
                
            }
            sums[j] = sum;
            
        }
        double max = sums[0];
        int index = 0;
        for (int i = 0; i < sums.length; i++) {
            if(sums[i] > max) {
                max = sums[i];
                index = i;
            }
        }
        System.out.println("Max sum in column " + index);
        return index;
    }


}

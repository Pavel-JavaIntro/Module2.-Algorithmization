package by.pavka.algorithmization.one_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Дан массив действительных чисел, размерность которого N. П
 * одсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 
 */
public class Task3 {

	public static void main(String[] args) {
		double[] arrayD = {1.2, 3.3, -4, 2.2, 3.3, 6, 0.0};
		Helper.printArray(calculateMembers(arrayD));

	}
	
	public static int[] calculateMembers(double[] array) {

        int negative = 0;
        int neutral = 0;
        int positive = 0;
        for(double element: array) {
            if(element < 0) negative++;
            else if(element == 0) neutral++;
            else positive++;
        }

        return new int[]{negative, neutral, positive};
    }

}

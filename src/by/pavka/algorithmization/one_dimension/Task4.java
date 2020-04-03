package by.pavka.algorithmization.one_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
public class Task4 {

	public static void main(String[] args) {
		double[] arrayD = {1.2, 3.3, -4, 2.2, 3.3, 6};
		exchangeMinMax(arrayD);

	}
	
	public static void exchangeMinMax(double[] array) {
        Helper.printArray(array);
        double min = array[0];
        int minIndex = 0;
        double max = array[0];
        int maxIndex = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                minIndex = i;
                min = array[i];
            }
            if(array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
        }
        array[minIndex] = max;
        array[maxIndex] = min;

        Helper.printArray(array);;
    }


}

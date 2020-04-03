package by.pavka.algorithmization.one_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
 */
public class Task2 {

	public static void main(String[] args) {
		double[] arrayD = {1.2, 3.3, -4, 2.2, 3.3, 6};

        System.out.println(changeToZ(arrayD, 3));
        Helper.printArray(arrayD);

	}
	
	public static int changeToZ(double[] array, double z) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > z) {
                count++;
                array[i] = z;
            }
        }
        return count;
    }

}

package by.pavka.algorithmization.one_dimension;

/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
 */
public class Task5 {

	public static void main(String[] args) {
		int[] array = {0, -1, 4, 5, -2, 6, -2, 4, -3, -3, 7};
		printBiggers(array);

	}
	
	public static void printBiggers(int[]array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] > i) System.out.println(array[i]);
        }
    }

}

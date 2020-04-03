package by.pavka.algorithmization.one_dimension;

/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */
public class Task1 {

	public static void main(String[] args) {
		int[] array = {0, -1, 4, 5, -2, 6, -2, 4, -3, -3, 7};
		System.out.println(sumOfMultiples(array, -1));
	}
	
	public static int sumOfMultiples(int[] array, int mult) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % mult == 0) sum += array[i];
        }
        return sum;
    }

}

package by.pavka.algorithmization.one_dimension;

/*Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами
 */
public class Task6 {

	public static void main(String[] args) {
		int[] array = {0, -1, 4, 5, -2, 6, -2, 4, -3, -3, 7};
		System.out.println(sumSimpleIndex(array));

	}
	
	//This method calculates sum of elements, which sequence number (index + 1) is simple
    public static int sumSimpleIndex(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            if(isSimple(i+1)) sum += array[i];
        }
        return sum;
    }
    //This auxiliary method checks if the number is simple
    private static boolean isSimple(int i) {
        if(i <= 1) return false;
        for(int j = 2; j <= i / 2; j++) {
            if(i % j == 0) return false;
        }
        return true;
    }

}

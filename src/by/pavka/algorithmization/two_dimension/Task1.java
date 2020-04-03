package by.pavka.algorithmization.two_dimension;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */
public class Task1 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};

        printOddColumns(intArray);

	}
	
	public static void printOddColumns(int[][] array) {
        for(int j = 0; j < array.length; j = j + 2) {
            if(array[0][j] > array[array.length - 1][j]) {
                for(int i = 0; i < array.length; i++) System.out.print(array[i][j] + " ");
                System.out.println();
            }
        }
    }

}

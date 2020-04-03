package by.pavka.algorithmization.two_dimension;
/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Task3 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};

        printRowAndColumn(intArray, 1, 1);

	}
	
	public static void printRowAndColumn(int[][] array, int k, int p) {
        if(k < 0 || k >= array.length || p < 0 || p >= array[k].length) {
        	System.out.println("Wrong args");
        	return;
        }

        for(int j = 0; j < array[k].length; j++) {
            System.out.print(array[k][j] + " ");
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i][p] + " ");
        }
        System.out.println();
    }

}

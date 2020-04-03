package by.pavka.algorithmization.two_dimension;
/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
public class Task2 {

	public static void main(String[] args) {
		int[][]intArray = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};
        printDiagonals(intArray, false);

	}

	public static void printDiagonals(int[][] array, boolean onMainDiagonal) {
        int size = array.length;
        if(onMainDiagonal) {
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    if(i == j) System.out.print(array[i][j] + " ");
                }
            }
        }
        else {
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    if(i == size - 1 - j) System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

}

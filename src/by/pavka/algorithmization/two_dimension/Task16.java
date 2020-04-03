package by.pavka.algorithmization.two_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2 n так, 
 * что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат
 */
public class Task16 {

	public static void main(String[] args) {
		formMagicSquare(7);

	}
	
	public static int[][] formMagicSquare(int n) {
		// Initializing a variable named n and assigning the integer 3 to it
        
        // Initializing a multi-dimensional array with 3 rows and 3 columns max
        int m[][] = new int[n][n]; // 3 by 3

        int i, j;
        // Assigning 1 to variable num
        int num = 1;

        int nn = n * 3 / 2; //4


        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                m[(j - i + nn) % n][(i * 2 - j + n) % n] = num++; 

                System.out.println(num);
            } // next j
        } //next i
        
        Helper.printMatrix(m);
        return m;

	}

}

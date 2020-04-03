package by.pavka.algorithmization.two_dimension;

import java.util.Random;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
 */
public class Task11 {

	public static void main(String[] args) {
		generateRandomMatrix();

	}
	
	//This method generates a random matrix 10x15, prints it and prints row numbers with three or more fives
    public static void generateRandomMatrix() {
        int rows = 10;
        int cols = 20;
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(15);
            }
        }
        int counter = 0;
        int[] lucky = new int[10];
        
        for(int i = 0; i < rows; i++) {
            int fives = 0;
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == 5) fives++;
                System.out.print(matrix[i][j] + " ");
            }
            if(fives >= 3) lucky[counter++] = i;
            System.out.println();
        }
       
        
        
        System.out.println("Lucky rows: ");
        for(int i = 0; i < counter; i++) System.out.print(lucky[i] + " ");
        System.out.println();

    }

}

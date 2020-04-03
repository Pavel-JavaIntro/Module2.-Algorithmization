package by.pavka.algorithmization.two_dimension;

import java.util.Arrays;

import by.pavka.algorithmization.util.Helper;

/*
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить 
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 */
public class Task8 {

	public static void main(String[] args) {
		int[][]array3 = {{1, 2, 3},{0, -6, 5},{4, 4, 0}};
		exchangeColumns(array3);
        for(int i = 0; i < array3.length; i++) {
            Helper.printArray(array3[i]);
        }

	}
	
	//This method exchange 2 columns
    public static void exchangeColumns(int[][] array) {
        int size = array.length;
        int first = Helper.readIntFromConsole("input an integer");
        int second = Helper.readIntFromConsole("input an integer");
        if(first < 0 || first >= size || second < 0 || second >= size) {
        	System.out.println("Wrong args");
        	return;
        }
        int [] col = new int[size];
        for(int i = 0; i < size; i++) {
            col[i] = array[i][first];
            array[i][first] = array[i][second];
            array[i][second] = col[i];
        }
    }


}

package by.pavka.algorithmization.one_dimension;

import by.pavka.algorithmization.util.Helper;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, 
 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать
 */
public class Task10 {

	public static void main(String[] args) {
		int[] array = {0, -1, 4, 5, -2, 6, -2, 4, -3, -3, 7};
		shift(array, 0);
        Helper.printArray(array);
        processArray(array);
        Helper.printArray(array);
	}
	
	//This method "compresses the input array by removing each second value and shifting
    public static void processArray(int[] array) {
        for (int i = 1; i < array.length; i ++) {
            shift(array, i);
        }
    }

  //This auxiliary method removes value at index, moves all other values to 1 cell left and fills the right cell with 0
    private static void shift(int[] array, int index) {
        for(int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }

}

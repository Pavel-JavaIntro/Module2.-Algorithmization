package by.pavka.algorithmization.one_dimension;

import java.util.Arrays;

import by.pavka.algorithmization.util.Helper;

/*
 * Дана последовательность целых чисел a1 a2 an , , ,  . Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min( a1 a2 ... an )  
 */
public class Task8 {

	public static void main(String[] args) {
		int[] array = {0, -1, 4, 5, -2, 6, -2, 4, -3, -3, 7};
		System.out.println("Exclude min: ");
		Helper.printArray(excludeMin(array));
	}
	
	public static int[] excludeMin(int[] array) {
        int min = array[0];
        for(int e: array) {
            if(e < min) min = e;
        }
        int decrease = 0;
        for(int e: array) {
        	if(e == min) decrease++;
        }
        
        int[] result = new int[array.length - decrease];
        
        int j = 0;
        for(int i = 0; i < array.length; i++) {
        	if(array[i] > min) {
        		result[j++] = array[i];
        	}
        }
        
        return result;
    }


}

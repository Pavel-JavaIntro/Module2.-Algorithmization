package by.pavka.algorithmization.one_dimension;



import by.pavka.algorithmization.util.Helper;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них. 
 */
public class Task9 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 4, 0, 0, 4, 1, 5, 0, 4, 6};
		System.out.println("Serching for the most frequent element among ");
		Helper.printArray(array1);
		System.out.println("And the most frequent is " +getMostFrequent(array1));
		Helper.printArray(array1);
	
	}
	
	public static int getMostFrequent(int[] array) {
    	int n = array.length;

    	for(int i = n - 1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                
                if( array[j] < array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    
    	int lastIndex = 0;
    	int frequency = 1;
    	int maxFrequency = 1;
    	for(int i = 1; i < n; i++) {
    		if(array[i] == array[i-1]) {
    			frequency++;
    		}
    		else {
    			if(frequency >= maxFrequency) {
    				maxFrequency = frequency;
    				lastIndex = i - 1;
    				frequency = 1;
    			}
    			else {
    			
        			frequency = 1;
    			}
    			
    		}
    	}
    	if(frequency >= maxFrequency) lastIndex = n - 1;
    	
    	return array[lastIndex];
    }


}

package by.pavka.algorithmization.one_dimension;

/*
 * Даны действительные числа a1 a2 ...a2n . 
 * Найти max( a1 + a2n, a2 + a2n−1 ... an + an+1 )
 */
public class Task7 {

	public static void main(String[] args) {
		double[] arrayD = {1.2, 3.3, -4, 2.2, 3.3, 6};

		System.out.println(getMaxPair(arrayD));
	}
	
	public static double getMaxPair(double[] array) {
        int length = array.length;
        double[] pairs = new double[length / 2];
        double max = array[0] + array[length - 1];
        for(int i = 0; i < length / 2; i++) {
            pairs[i] = array[i] + array[length - 1 - i];
            if(pairs[i] > max) max = pairs[i];
        }
        return max;
    }

}

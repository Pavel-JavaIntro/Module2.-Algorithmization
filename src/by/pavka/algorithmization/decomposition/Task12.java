package by.pavka.algorithmization.decomposition;

import by.pavka.algorithmization.util.Helper;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых 
 * равна К и которые не большее N
 */
public class Task12 {
	public static void main(String[] args) {
        System.out.println(sumOfDigits(-10));

        formArray(3, 2910);
    }

    //This method solves the task
    public static int[] formArray(int k, int n) {
        int length = calculateCombinations(k, n);

        int[] arr = new int[length];

        int ind = 0;

        for(int i = 0; i <= n; i++) {
            if(sumOfDigits(i) == k) {
                arr[ind++] = i;
            }
        }
        Helper.printArray(arr);
        return arr;
    }
    //This method calculates number of numbers, which figure sum is equal to k and which is not more than n
    private static int calculateCombinations(int k, int n) {
        if(k <= 0 || n <= 0 || k > n) return 0;

        int combinations = 0;
        for(int i = 0; i <= n; i++) {
            if(sumOfDigits(i) == k) {
                combinations++;
            }
        }

        return combinations;
    }

    //This method calculates sum of figures in a number
    private static int sumOfDigits(int number) {
        number = Math.abs(number);
        if(number < 10) return number;

        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        }
        while(number / 10 > 0);
        sum += number;

        return sum;
    }

}

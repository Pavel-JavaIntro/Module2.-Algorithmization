package by.pavka.algorithmization.decomposition;

/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию
 */
public class Task13 {

	public static void main(String[] args) {
        System.out.println(isSimple(1));
        twins(30);
    }

    public static void twins(int n) {
        if(n <= 2) {
            System.out.println("Wrong argument");
            return;
        }
        for(int i = n; i <= 2 * n - 2; i++) {
            if(isSimple(i) && isSimple(i + 2)) {
                System.out.println("Twins: " + i + " and " + (i + 2));
            }
        }
    }

    private static boolean isSimple(int a) {
        if(a <= 1) return false;

        for(int i = 2; i <= a / 2; i++) {
            if(a % i == 0) return false;
        }
        return true;
    }
}

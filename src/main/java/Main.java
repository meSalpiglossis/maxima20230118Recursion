public class Main {

    public static void main(String[] args) {
        int n = 25;

        for (int fNumber : fibonacciNumbers(n)) {
            System.out.print(fNumber + " ");
        }
    }

    public static int[] fibonacciNumbers(int n) {
        int[] fn = new int[n];
        for (int i = 0; i < n; ++i) {
            fn[i] = recursiveFib(i);
        }
        return fn;
    }

    public static int recursiveFib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }
}

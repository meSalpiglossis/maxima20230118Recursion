public class FiboClassic {

    private static int calculationSteps = 0;

    public static void main(String[] args) {
        int n = 25;
        for (Long fNumber : fibonacciNumbers(n)) {
            System.out.print(fNumber + " ");
        }

        System.out.printf("\n%d calculations required in total.", calculationSteps);
    }

    public static Long[] fibonacciNumbers(int n) {
        Long[] fn = new Long[n];

        for (int i = 0; i < n; ++i) {
            fn[i] = recursiveFib(i);
        }

        return fn;
    }

    public static Long recursiveFib(int n) {
        calculationSteps++;

        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 0L;
        } else if (n == 1 || n == 2) {
            return 1L;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }
}

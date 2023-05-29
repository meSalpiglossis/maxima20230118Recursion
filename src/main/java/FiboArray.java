import java.util.ArrayList;

public class FiboArray {

    private static int calculationSteps = 0;
    private static ArrayList<Long> tempArray = new ArrayList<>();

    public static void main(String[] args) {
        int n = 25;
        for (int i = 0; i <= n; i++) {
            tempArray.add(-1L);
        }

        tempArray.set(0, 0L);
        tempArray.set(1, 1L);
        tempArray.set(2, 1L);

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
        } else {
            if (tempArray.get(n) != -1) return tempArray.get(n);
            tempArray.set(n, recursiveFib(n - 1) + recursiveFib(n - 2));
            return tempArray.get(n);
        }
    }
}

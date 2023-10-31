package Workshop_Day4;

public class AmicablePairs {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;

        if (areAmicable(num1, num2)) {
            System.out.println(num1 + " ve " + num2 + " amicable sayı çiftidir.");
        } else {
            System.out.println(num1 + " ve " + num2 + " amicable sayı çifti değildir.");
        }
    }

    public static boolean areAmicable(int num1, int num2) {
        return (sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1);
    }

    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

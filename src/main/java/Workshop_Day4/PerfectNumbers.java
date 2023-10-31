package Workshop_Day4;

public class PerfectNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 10) {
            if (isPerfect(number)) {
                System.out.println(number + " mükemmel bir sayıdır.");
                count++;
            }
            number++;
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num) {
                    sum = sum + i + num / i;
                } else {
                    sum = sum + i;
                }
            }
        }

        return sum == num;
    }
}

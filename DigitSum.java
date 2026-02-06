import java.util.Scanner;

public class DigitSum {
    public static int digitSum(int n, int opt) {
        int sum = 0;
        n = Math.abs(n);   // handle negative numbers

        while (n > 0) {
            int digit = n % 10;

            if (opt == 0 && digit % 2 == 0) {
                sum += digit;   // even digits
            } 
            else if (opt == 1 && digit % 2 != 0) {
                sum += digit;   // odd digits
            }

            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    // number
        int opt = sc.nextInt();  // 0 → even, 1 → odd

        System.out.println(digitSum(n, opt));
    }
}

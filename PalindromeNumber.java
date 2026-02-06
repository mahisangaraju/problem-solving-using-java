import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;   // negative numbers not palindrome

        int original = x;
        int rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));
    }
}

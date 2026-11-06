import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();


        String s = Long.toString(t);
        StringBuilder sb = new StringBuilder(s);


        for (int i = s.length() - 2; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        long palindrome = Long.parseLong(sb.toString());

        if (isPrime(palindrome)) {
            System.out.println("prime");
        } else {
            System.out.println("noprime");
        }

        sc.close();
    }


    static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }


        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        for (int i = 0; i + 2 < n; i++) {
            if (a[i] + a[i + 1] > a[i + 2]) {
                System.out.println(a[i] + " " + a[i + 1] + " " + a[i + 2]);
                return;
            }
        }

        System.out.println("No solution");

        sc.close();
    }
}
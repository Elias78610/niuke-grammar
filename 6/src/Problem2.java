import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long base = 0;
        long[] diff = new long[n];

        for (int i = 0; i < n; i++) {
            long b = sc.nextLong();
            base += b;
            diff[i] = a[i] - b;
        }


        Arrays.sort(diff);

        long answer = base;

        for (int i = n - 1; i >= n - k; i--) {
            answer += diff[i];
        }

        System.out.println(answer);

        sc.close();
    }
}
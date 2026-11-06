import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }


        Arrays.sort(a, (x, y) -> (y + x).compareTo(x + y));

        StringBuilder sb = new StringBuilder();

        for (String s : a) {
            sb.append(s);
        }

        System.out.println(sb);

        sc.close();
    }
}
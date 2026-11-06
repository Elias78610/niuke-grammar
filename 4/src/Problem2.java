import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == x) {
                    count++;
                }
                temp /= 10;
            }
        }

        System.out.println(count);
    }
}
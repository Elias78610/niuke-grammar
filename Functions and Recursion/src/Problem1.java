import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int count = 0;

        for (int i = L; i <= R; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 2) {
                    count++;
                }
                temp /= 10;
            }
        }

        System.out.println(count);
    }
}
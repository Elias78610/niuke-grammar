import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prev = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            prev = last;
            last = x;
        }

        if (last == 0) {

            System.out.println("up");
        } else if (last == 15) {

            System.out.println("down");
        } else if (n == 1) {

            System.out.println("-1");
        } else if (last > prev) {

            System.out.println("up");
        } else {

            System.out.println("down");
        }

        sc.close();
    }
}
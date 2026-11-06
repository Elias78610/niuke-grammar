import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int days = daysInMonth(y, m);
            int ans = 0;

            ans += countDigit(y, x, 4) * days;
            ans += countDigit(m, x, 2) * days;
            for (int d = 1; d <= days; d++) {
                ans += countDigit(d, x, 2);
            }

            System.out.println(ans);
        }
    }

    static int countDigit(int num, int x, int width) {
        int cnt = 0;
        for (int i = 0; i < width; i++) {
            if (num % 10 == x) {
                cnt++;
            }
            num /= 10;
        }
        return cnt;
    }

    static int daysInMonth(int y, int m) {
        if (m == 2){
            return isLeap(y) ? 29 : 28;
        }else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }else{
            return 31;
        }
    }

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
}
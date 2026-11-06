import java.util.Scanner;

public class Problem2   {

    static int[] row = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2};
    static int[] col = {0, 0, 1, 2, 0, 1, 2, 0, 1, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();


        while (sc.hasNext()) {
            String s = sc.next();
            out.append(isValid(s) ? "YES" : "NO").append('\n');
        }

        System.out.print(out);
        sc.close();
    }

    static boolean isValid(String s) {
        boolean[] used = new boolean[10];
        int prev = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch < '1' || ch > '9') {
                return false;
            }

            int cur = ch - '0';

            if (used[cur]) {
                return false;
            }

            if (prev != -1) {
                int dr = Math.abs(row[prev] - row[cur]);
                int dc = Math.abs(col[prev] - col[cur]);

                if (dr % 2 == 0 && dc % 2 == 0) {
                    int mr = (row[prev] + row[cur]) / 2;
                    int mc = (col[prev] + col[cur]) / 2;
                    int mid = mr * 3 + mc + 1;

                    if (!used[mid]) {
                        return false;
                    }
                }
            }

            used[cur] = true;
            prev = cur;
        }

        return true;
    }
}
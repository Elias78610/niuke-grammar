public class Problem1 {
    static int[] path = new int[8];
    static boolean[] used = new boolean[9];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        dfs(0);
        System.out.print(sb);
    }

    static void dfs(int pos) {

        if (pos == 8) {
            for (int i = 0; i < 8; i++) {
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(path[i]);
            }
            sb.append('\n');
            return;
        }


        for (int x = 1; x <= 8; x++) {
            if (!used[x]) {
                used[x] = true;
                path[pos] = x;

                dfs(pos + 1);

                used[x] = false;
            }
        }
    }
}
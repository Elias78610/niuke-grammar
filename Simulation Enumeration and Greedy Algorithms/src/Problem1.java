import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long t = sc.nextLong();
        String str = sc.next();

        int dot = str.indexOf('.');

        // 没有小数点，不能进行题目要求的舍入
        if (dot == -1) {
            System.out.println(str);
            return;
        }

        // 找小数点后第一个 >= 5 的位置
        int p = -1;
        for (int i = dot + 1; i < str.length(); i++) {
            if (str.charAt(i) >= '5') {
                p = i;
                break;
            }
        }

        // 没有可以五入的位置，保留原数
        if (p == -1) {
            System.out.println(clean(str));
            return;
        }

        if (t == 0) {
            System.out.println(clean(str));
            return;
        }

        // 从 p-1 开始向左跳过连续的 4
        int q = p - 1;
        while (q > dot && str.charAt(q) == '4') {
            q--;
        }

        int end;

        if (t >= p - q) {
            end = q;
        } else {
            end = p - (int) t;
        }

        // 保留到 end 位置
        StringBuilder sb = new StringBuilder(str.substring(0, end + 1));

        if (end == dot) {
            // 舍入到整数，删除小数点，再给整数部分加 1
            sb.deleteCharAt(sb.length() - 1);
            addOne(sb, sb.length() - 1);
        } else {
            // 给 end 位置的数字加 1
            addOne(sb, end);
        }

        System.out.println(clean(sb.toString()));

        sc.close();
    }

    // 给 sb 的 pos 位置加 1，处理连续 9 的进位
    static void addOne(StringBuilder sb, int pos) {
        while (pos >= 0) {
            char c = sb.charAt(pos);

            if (c == '.') {
                pos--;
                continue;
            }

            if (c == '9') {
                sb.setCharAt(pos, '0');
                pos--;
            } else {
                sb.setCharAt(pos, (char) (c + 1));
                return;
            }
        }

        // 所有位都是 9，例如 9.9 -> 10
        sb.insert(0, '1');
    }

    // 去除前导零和末尾多余的零
    static String clean(String s) {
        // 去掉小数点后的尾零
        int dot = s.indexOf('.');
        if (dot != -1) {
            int end = s.length();

            while (end > dot + 1 && s.charAt(end - 1) == '0') {
                end--;
            }

            // 小数部分全是 0，连小数点一起去掉
            if (end == dot + 1) {
                end = dot;
            }

            s = s.substring(0, end);
        }

        // 去掉前导零，但保留一个 0
        int i = 0;
        while (i < s.length() - 1
                && s.charAt(i) == '0'
                && s.charAt(i + 1) != '.') {
            i++;
        }

        return s.substring(i);
    }
}
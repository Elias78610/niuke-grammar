import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        String[] words = {"zero", "two", "four", "six", "nine"};
        char[] digits = {'0', '2', '4', '6', '9'};

        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            String s = sc.next();
            StringBuilder ans = new StringBuilder();

            int i = 0;

            while (i < s.length()) {
                char c = s.charAt(i);
                boolean matched = false;


                for (int j = 0; j < digits.length; j++) {
                    if (c == digits[j]) {
                        ans.append(c);
                        i++;
                        matched = true;
                        break;
                    }
                }

                if (matched) {
                    continue;
                }

                for (int j = 0; j < words.length; j++) {
                    if (s.startsWith(words[j], i)) {
                        ans.append(digits[j]);
                        i += words[j].length();
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    i++;
                }
            }

            output.append(ans).append('\n');
        }

        System.out.print(output);
        sc.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder();
        int ch;


        while ((ch = br.read()) != -1) {
            input.append((char) ch);
        }

        String s = input.toString();
        int n = s.length();

        StringBuilder out = new StringBuilder();
        boolean inString = false;
        int i = 0;

        while (i < n) {
            char c = s.charAt(i);

            if (inString) {

                out.append(c);


                if (c == '"' && (i == 0 || s.charAt(i - 1) != '\\')) {
                    inString = false;
                }

                i++;
            } else {
                if (c == '"' && (i == 0 || s.charAt(i - 1) != '\\')) {

                    inString = true;
                    out.append(c);
                    i++;
                } else if (c == '/' && i + 1 < n && s.charAt(i + 1) == '*') {

                    int close = s.indexOf("*/", i + 2);

                    if (close == -1) {

                        out.append(c);
                        i++;
                    } else {

                        i = close + 2;
                    }
                } else {

                    out.append(c);
                    i++;
                }
            }
        }

        System.out.print(out);
    }
}
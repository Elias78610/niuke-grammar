import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int balance = 0;
        boolean good = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') {
                balance++;
            } else if (c == 'b') {
                balance--;


                if (balance < 0) {
                    good = false;
                    break;
                }
            } else {

                good = false;
                break;
            }
        }


        if (balance != 0) {
            good = false;
        }

        System.out.println(good ? "Good" : "Bad");

        sc.close();
    }
}
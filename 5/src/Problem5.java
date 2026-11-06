import java.math.BigInteger;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();                      // 吃掉数字后的换行

        for (int i = 0; i < T; i++) {
            String a = sc.next();
            String b = sc.next();
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            System.out.println(x.multiply(y));
        }
    }
}
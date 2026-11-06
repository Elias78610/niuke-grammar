import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[10];
        int total = 0;

        for (int i = 0; i < 10; i++) {
            cnt[i] = sc.nextInt();
            total += cnt[i];
        }


        int oddCount = 0;
        int middle = -1;

        for (int i = 0; i < 10; i++) {
            if (cnt[i] % 2 == 1) {
                oddCount++;
                middle = i;
            }
        }


        if (oddCount > 1 || total == 0) {
            System.out.println("-1");
            return;
        }

        int[] half = new int[10];
        int pairCount = 0;

        for (int i = 0; i < 10; i++) {
            half[i] = cnt[i] / 2;
            pairCount += half[i];
        }

        if (pairCount == 0) {
            System.out.println(middle);
            return;
        }

        StringBuilder left = new StringBuilder();

        if (half[0] > 0) {
            int first = -1;

            for (int i = 1; i <= 9; i++) {
                if (half[i] > 0) {
                    first = i;
                    break;
                }
            }


            if (first == -1) {
                System.out.println("-1");
                return;
            }

            left.append((char) ('0' + first));
            half[first]--;
        }

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < half[i]; j++) {
                left.append((char) ('0' + i));
            }
        }

        StringBuilder answer = new StringBuilder(left);

        if (middle != -1) {
            answer.append((char) ('0' + middle));
        }

        answer.append(new StringBuilder(left).reverse());

        System.out.println(answer);
        sc.close();
    }
}
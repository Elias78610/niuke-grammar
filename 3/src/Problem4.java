import java.util.Scanner;

public class Problem4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();



            for (int i = 1; i <= n/2+1; i++) {
                for (int j =n/2+1-i; j >=1; j--) {
                    System.out.print(" ");
                }
                for (int j =2*i-1; j >=1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }


            for (int i = 1; i <= n/2; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(" ");
                }
                for (int j = n-2*i; j >=1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
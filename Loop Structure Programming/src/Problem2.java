import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(b);
                b++;
            }
            System.out.println();

        }

    }
}
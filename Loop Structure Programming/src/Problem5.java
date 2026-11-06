import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            suan(n);
        }

    }
    public static void suan(int p){
        int n=p;
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=(n+1-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i==n+1){
                for(int j=n;1<=j;j--){
                    for(int k=(n+1-j)*2;1<=k;k--){
                        System.out.print(" ");

                    }
                    for(int l=1;l<=j;l++){
                        System.out.print("*");
                    }
                    System.out.println();
                }


            }
        }

    }
}
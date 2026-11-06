import java.util.Scanner;

public class Problem1 {
    public static void suan(Long[] nn,int n){
        double p = 0;
        double b=0;
        Long max = nn[1];
        Long min = nn[1];
        for(int i=1;i<=n;i++){
            Long a = nn[i];
            p+=a;
            b+=1;
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }
        }
        double ave = p/b;
        double ji = max-min;
        double c=0;
        for(int i=1;i<=n;i++){
            Long a = nn[i];
            double d = a-ave;
            c += d*d;
        }
        c = c/n;

        System.out.printf("%.0f %.3f\n",ji,c);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juan = sc.nextInt();

        for(int i=1;i<=juan;i++){
            int n = sc.nextInt();
            Long[] nn = new Long[n+1];
            for(int j=1;j<=n;j++){

                Long a = sc.nextLong();
                nn[j] = a;



            }
            suan(nn,n);




        }
    }
}
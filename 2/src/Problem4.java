import java.util.*;

public class Problem4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        if(m %n == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
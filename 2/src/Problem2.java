import java.util.*;

public class Problem2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        if(n % 2 == 0){
            System.out.println(n/2);
        }
        else{
            System.out.println(3*n+1);
        }
    }
}

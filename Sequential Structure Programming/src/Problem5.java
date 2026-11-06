public class Problem5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i*j)/10>0) {
                    System.out.print(j+"*"+i+"="+i*j);
                }
                else {
                    System.out.print(j+"*"+i+"="+" "+i*j);
                }
                if (i==j){
                    System.out.print("");
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package If_Else;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int x=sc.nextInt();
        int y= (x>=0) ? 100 : 0;
        System.out.println(y);
        System.out.println(100+ "      " + ((9==2) ? "true" : "false"));
        sc.close();
    }
}

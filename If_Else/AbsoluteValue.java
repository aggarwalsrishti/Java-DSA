package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int x=sc.nextInt();
        System.out.print("ABSOLUTE VALUE:");
        if (x>=0) {
            System.out.println(x);
        }
        else{
            System.out.println(-x);
        }
        sc.close();
    }
}

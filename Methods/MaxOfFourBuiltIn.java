package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER:");
        int b=sc.nextInt();
        System.out.print("ENTER THE THIRD NUMBER:");
        int c=sc.nextInt();
        System.out.print("ENTER THE FOURTH NUMBER:");
        int d=sc.nextInt();
        System.out.print("MAXIMUM NUMBER:");
        System.out.println(Math.max(d, Math.max(c , Math.max(b,a))));
        sc.close();
    }
}

package Basics;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER RADIUS OF CIRCLE:");
        int r=sc.nextInt();
        System.out.println(3.14*r*r);
        System.out.print("ENTER RADIUS OF CIRCLE:");
        double a=sc.nextDouble();
        System.out.println(3.14*a*a);
        sc.close();
    }
}

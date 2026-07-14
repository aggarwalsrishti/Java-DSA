package Basics;

import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:");
        int a= sc.nextInt();
        System.out.print("ENTER SECOND NUMBER:");
        int b= sc.nextInt();
        System.out.println("SUM OF TWO NUMBERS:"+(a+b));
        sc.close();

    }
}

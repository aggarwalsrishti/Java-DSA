package If_Else;

import java.util.Scanner;

public class IntegerDivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER POSITIVE INTEGER:");
        int a=sc.nextInt();
        int b=a%5;
        int c=a%3;
        if (b==0){
            System.out.println("Number divisible by 5");
        }
        if (c==0){
            System.out.println("Number divisible by 3");
        }
        if (b==0 && c==0) {
            System.out.println("Number divisible by 5 and 3 both");
        }
        if (b==0 || c==0){
            System.out.println("Number divisible by 5 or 3");
        }
        sc.close();
    }
}

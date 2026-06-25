package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER POSITIVE INTEGER:");
        int x=sc.nextInt();
        if (x>999 && x<10000) {
            System.out.println("IT IS A FOUR DIGIT NUMBER");
        }
        else{
            System.out.println("IT IS NOT A FOUR DIGIT NUMBER");
        }
        sc.close();
    }
}

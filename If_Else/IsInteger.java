package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        double x= sc.nextDouble();
        int y=(int)x;
        if (x-y==0){
            System.out.println("NUMBER IS INTEGER");
        }
        else{
            System.out.println("NUMBER IS NOT INTEGER");
        }
        sc.close();
    }
}

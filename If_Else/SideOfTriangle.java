package If_Else;

import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER FIRST SIDE:");
        int a=sc.nextInt();
        System.out.print("ENTER SECOND SIDE:");
        int b=sc.nextInt();
        System.out.print("ENTER THIRD SIDE:");
        int c=sc.nextInt();
        if (a+b>c && b+c>a && a+c>b){
            System.out.println("THEY ARE THE SIDES OF TRIANGLE");
        }
        else{
            System.out.println("THEY ARE NOT THE SIDES OF TRIANGLE");
        }
        sc.close();
    }
}

package If_Else;

import java.util.Scanner;

public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER LENGTH:");
        int l=sc.nextInt();
        System.out.print("ENTER BREADTH:");
        int b=sc.nextInt();
        int p=2*(l+b);
        int a=l*b;
        if (a==p){
            System.out.println("AREA AND RECTANGLE ARE EQUAL");
        }
        else if (a>p){
            System.out.println("AREA IS GREATER THAN PERIMETER");
        }
        else if (a<p){
            System.out.println("AREA IS LESSER THAN PERIMETER");
        }
        sc.close();
    }
}

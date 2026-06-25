package If_Else;

import java.util.Scanner;

public class FindQuadrant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER x VALUE:");
        int x= sc.nextInt();
        System.out.print("Enter y value:");
        int y= sc.nextInt();
        if (x==0 && y==0){
            System.out.println("POINT AT ORIGIN");
        }
        else if (x==0){
            System.out.println("POINT LIES ON THE Y-AXIS");
        }
        else if (y==0){
            System.out.println("POINT LIES ON THE X-AXIS");
        }
        else if (x>=0 && y>=0) {
            System.out.println("POINT LIES IN THE 1st QUADRANT");
        }
        else if (x<=0 && y>=0){
            System.out.println("POINT LIES IN THE 2nd QUADRANT");
        }
        else if (x<=0 && y<=0){
            System.out.println("POINT LIES IN THE 3rd QUADRANT");
        }
        else if (x>=0 && y<=0){
            System.out.println("POINT LIES IN THE 4th QUADRANT");
        }
        sc.close();
    }
}

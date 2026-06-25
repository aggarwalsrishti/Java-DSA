package If_Else;

import java.util.Scanner;

public class GreatestInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER FIRST INTEGER:");
        int a=sc.nextInt();
        System.out.print("ENTER SECOND INTEGER:");
        int b=sc.nextInt();
        System.out.print("ENTER THIRD INTEGER:");
        int c=sc.nextInt();
        if (a==b && a==c){
            System.out.println("ALL 3 INTEGERS ARE EQUAL");
        }
        else if (a==b && a>c){
            System.out.println("FIRST AND SECOND INTEGER ARE EQUAL AND THEY ARE GREATER THAN THIRD INTEGER");
        }
        else if (a==b && a<c){
            System.out.println("FIRST AND SECOND INTEGER ARE EQUAL AND THEY ARE LESSER THAN THIRD INTEGER");
        }
        else if (a==c && a>b){
            System.out.println("FIRST AND THIRD INTEGER ARE EQUAL AND THEY ARE GREATER THAN SECOND INTEGER");
        }
        else if (a==c && a<b){
            System.out.println("FIRST AND THIRD INTEGER ARE EQUAL AND THEY ARE LESSER THAN SECOND INTEGER");
        }
        else if (b==c && a>b){
            System.out.println("SECOND AND THIRD INTEGER ARE EQUAL AND FIRST INTEGER ARE GREATER THAN SECOND AND THIRD INTEGER");
        }
        else if (b==c && a<b){
            System.out.println("SECOND AND THIRD INTEGER ARE EQUAL AND FIRST INTEGER ARE LESSER THAN SECOND AND THIRD INTEGER");
        }
        else if (a>b && a>c){
            System.out.println("FIRST INTEGER IS GREATER THAN SECOND AND THIRD INTEGER");
        }
        else if (b>a && b>c){
            System.out.println("SECOND INTEGER IS GREATER THAN FIRST AND THIRD INTEGER");
        }
        else if (c>b && c>a){
            System.out.println("THIRD INTEGER IS GREATER THAN FIRST AND SECOND INTEGER");
        }
        sc.close();
    }
}

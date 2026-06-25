package If_Else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NUMBER:");
        int x=sc.nextInt();
        int y=x%2;
        if (y==0){
            System.out.println("NUMBER IS EVEN");
        }
        else{
            System.out.println("NUMBER IS ODD");
        }
        sc.close();
    }
}

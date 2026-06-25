package If_Else;

import java.util.Scanner;

public class MagnitudeCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER INTEGER:");
        int x=sc.nextInt();
        if(x<0){
            x=-x;
        }
        if (x>70){
            System.out.println("MAGNITUDE GREATER THAN 70");
        }
        else if (x==70){
            System.out.println("MAGNITUDE EQUAL TO 70");
        }
        else{
            System.out.println("MAGNITUDE LESSER THAN 70");
        }
        sc.close();
    }
}

package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER COST PRICE:");
        int cp= sc.nextInt();
        System.out.print("ENTER SELL PRICE:");
        int sp= sc.nextInt();
        if (cp>sp){
            System.out.println("LOSS AMOUNT:"+(cp-sp));
        }
        else if (cp==sp){
            System.out.println("NO PROFIT AND NO LOSS");
        }
        else{
            System.out.println("PROFIT AMOUNT:"+(sp-cp));
        }
        sc.close();
    }
}

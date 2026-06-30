package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    public static int factorial(int x){
        int fact=1;
        for (int i=1; i<=x; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("ENTER N:");
        int n=sc.nextInt();
        System.out.print("ENTER R:");
        int r=sc.nextInt();
        System.out.println("ncr:"+(factorial(n)/(factorial(r)*factorial(n-r))));
        System.out.println("npr:"+(factorial(n)/factorial(n-r)));
        sc.close();
    }
}

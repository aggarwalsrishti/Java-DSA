package Basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER PRINCIPAL:");
        double p=sc.nextDouble();
        System.out.print("ENTER RATE:");
        double r=sc.nextDouble();
        System.out.print("ENTER TIME:");
        double t=sc.nextDouble();
        double si=(p*r*t)/100.0;
        System.out.println("SIMPLE INTEREST:"+si);
        sc.close();

    }
}

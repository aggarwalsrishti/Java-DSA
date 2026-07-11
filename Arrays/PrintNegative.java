package Arrays;

import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ELEMENTS:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER ELEMENTS:");
        for (int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("NEGATIVE ELEMENTS IN ARRAY:");
        for (int j=0 ; j<arr.length ; j++){
            if (arr[j]<0){
                System.out.print(arr[j]+" ");
            }
        }
        sc.close();
    }
}

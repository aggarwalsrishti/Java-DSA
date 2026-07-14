package Arrays;

import java.util.Scanner;

public class SumAndMaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER NO OF ELEMENTS:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER ELEMENTS:");
        for (int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ARRAY:");
        for (int j=0 ; j<arr.length ; j++){
            System.out.print(arr[j]+"  ");
        }
        int sum=0;
        for (int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("SUM OF ARRAY:"+sum);
        int max=arr[0];
        for (int i=1 ; i<arr.length ; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("MAX OF ARRAY:"+max);
        int min=arr[0];
        for (int i=1; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("MIN OF ARRAY:"+min);
        sc.close();
    }
}

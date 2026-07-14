package Array;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum no:");
        int sum = sc.nextInt();
        int p=1;
        for (int i=0 ; i<n-1 ; i++){
            for (int j=i+1 ; j<n ; j++){
                if (arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
                    p=0;
                }
            }
        }
        if (p==1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found");
        }
        sc.close();
    }
}

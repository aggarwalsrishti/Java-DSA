package Array;

import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for( int i=0 ; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("The maximum number is:"+max);
        System.out.println("The second maximum number is:"+smax);
        sc.close();
    }
}

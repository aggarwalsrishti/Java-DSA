package Array;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int ele : arr){
            //ele is a copy so if we write ele*=2 it will not do any change in arr
            System.out.print(ele+"\t");
        }
        sc.close();
    }
}

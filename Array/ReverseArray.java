package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i=0,j=n-1;
        //when we want to reverse specific index range like 2 to 6 then
        //int i=2,j=6;
        /*
        for (int i=0 ; i<n/2 ; i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        */
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("The reversed array is:");
        for(int ele: arr){
            System.out.print(ele+"\t");
        }
    }
}

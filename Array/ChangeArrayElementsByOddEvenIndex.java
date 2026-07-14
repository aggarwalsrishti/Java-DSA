package Array;

import java.util.Scanner;

public class ChangeArrayElementsByOddEvenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] changedArray =new int[n];
        for (int i=0; i<n ; i++){
            if(i%2==0){
                changedArray[i]=arr[i]+10;
            }
            else{
                changedArray[i]=arr[i]*2;
            }
        }
        System.out.println();
        for (int i=0; i<n; i++){
            System.out.print(changedArray[i]+" ");
        }
    }
}

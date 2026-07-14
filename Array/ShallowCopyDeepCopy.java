package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a=4; //it takes 4 bytes
        int[] arr1={10,20,30,40};  //it takes 16 bytes
        int[] x=arr1;  // x is shallow copy of arr
        x[0]=100;
        int[] arr={10,20,30,40};
        int[] deep= Arrays.copyOf(arr,arr.length);
        deep[0]=100;
        System.out.println(arr[0]);
        System.out.println(arr1[0]);
        System.out.println(x[0]);
        System.out.println(deep[0]);
        int[] arr2 =new int[arr.length];
        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i]; //deep copy of arr
        }

    }
}

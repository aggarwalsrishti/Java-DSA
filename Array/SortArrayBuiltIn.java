package Array;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        //sort
        int[] arr={4,1,7,5,-4,10,3};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

}

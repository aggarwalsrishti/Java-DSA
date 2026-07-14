package Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int a=4; //it takes 4 bytes
        int[] arr={10,20,30,40};  //it takes 16 bytes
        int[] x=arr;  // x is shallow copy of arr
        x[0]=100;
        System.out.println(arr[0]);
    }
}

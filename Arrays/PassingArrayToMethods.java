package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(arr[3]);
        change(arr);
        System.out.println(arr[3]);
    }
    public static void change(int[] x){
        x[3]=9;
    }
}

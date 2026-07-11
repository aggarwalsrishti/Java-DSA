package Arrays;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        int[] arr_int= new int[7];
        for(int i=0; i<arr_int.length; i++){
            System.out.print(arr_int[i]+"  ");
        }
        System.out.println();
        double[] arr_double= new double[7];
        for(int i=0; i<arr_int.length; i++){
            System.out.print(arr_double[i]+"  ");
        }
        System.out.println();
        char[] arr_char= new char[7];
        for(int i=0; i<arr_char.length; i++){
            System.out.print(arr_char[i]+"  ");
        }
        System.out.println();
        char ch='\0';
        System.out.println((int)ch);
        int x=0 ; 
        System.out.println((char)x);
        String[] arr_str={"h","e","l","l","o"};
        for (int i=0 ; i<arr_str.length ; i++){
            System.out.print(arr_str[i]);
        }
    }
}

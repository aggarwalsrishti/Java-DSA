package Methods;

public class BuiltIn {
    public static void main(String[] args) {
        //Math Functions
        System.out.println(Math.sqrt(10));
        System.out.println(Math.cbrt(100));
        System.out.println(Math.PI);
        System.out.println(Math.abs(-100));
        System.out.println(Math.floor(-7.8));   //Greatest Integer
        System.out.println(Math.floor(7.8));
        System.out.println(Math.ceil(3.0001));
        System.out.println(Math.ceil(-3.0001));
        System.out.println(Math.min(3.542,9));
        System.out.println(Math.min(3,-9));
        System.out.println(Math.max(3,6));
        System.out.println(Math.pow(3.14,3));
        System.out.println(Math.pow(-3.123,-2.34)); //NaN
        System.out.println(Math.pow(-3.12,-2));
        System.out.println(Math.pow(3.12,5.2));
        System.out.println(Math.pow(0,0)); //1.0
    }
}

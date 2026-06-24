package Basic;

public class CharDataType {
    public static void main(String[] args) {
        char ch='a';
        System.out.println(ch);
        char x='#';
        System.out.println(x);
        char abc='A';
        int no=abc;  //implicit typecasting
        System.out.println(no);
        int y=(int)abc; //explicit typecasting
        System.out.println(y);
        char B='3';
        System.out.println((int)B);
        char e='b';
        System.out.println(e);
        System.out.println((int)e);
        System.out.println(e+0);
        System.out.println(e+e);
        System.out.println(e*e);
        System.out.println(e*1);
        int xyz=43;
        char ch1=(char)xyz;
        System.out.println(ch1);
    }
}

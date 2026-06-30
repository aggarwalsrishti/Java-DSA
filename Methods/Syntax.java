package Methods;

public class Syntax {
    public static void ABC(){
        System.out.println("HELLO WORLD");
    }
    public static void main(String[] args) {
        Hello();
        System.out.println("BYE WORLD");
        ABC();
    }
    public static void  Hello(){
        ABC();
        System.out.println("HELLO PEOPLE");
    }
}

package Methods;

public class ReturnType {
    public static int Value(){
        System.out.println("Hello");
        System.out.println("bye");
        return 5; //return means final line of function
    }
    public static void main(String[] args) {
        int x=Value();
        System.out.println(Value()+8);
        Value();
        System.out.println(x);
    }
}

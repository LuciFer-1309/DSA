package Recursion;

public class Global_Variable {
    static int x=10;
    public static void main(String args[]) {
        change();
        System.out.println(x);
    }
    public static void change() {
        x=7;
    }
}

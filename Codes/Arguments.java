package Methods;
import java.util.Scanner;
public class Arguments {
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }
    public static void sub(int a, int b) {
        System.out.println(a-b);
    }
    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
    public static void division(int a, int b) {
        System.out.println(a/b);
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a= sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b= sc.nextInt();
        sum(a,b);
        sub(a,b);
        multiply(a,b);
        division(a,b);
    }
}

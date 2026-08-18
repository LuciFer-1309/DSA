package Loops;
import java.util.Scanner;
public class a_raisedto_b {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a= sc.nextInt();
        System.out.print("Enter second Number:");
        int b= sc.nextInt();
        int power= 1;
        for(int i=1; i<=b; i++) {
            power *= a;
        }
        System.out.println("a" + " " + " raised to power b is" + " " + b + " " + "is" + " " + power);
    }
}

package Loops;
import java.util.Scanner;
public class Factorial_Number {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
        int fact= 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.println("The Factorial of a Number is" + " " + fact);
    }
}

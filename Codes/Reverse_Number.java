package Loops;
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x= sc.nextInt();
        int reverse= 0;
        while(x != 0) {
            int digit= x%10;
            reverse= reverse*10 + digit;
            x= x/10;
        }
        System.out.println("Reverse Number is" + " " + reverse);
    }
}

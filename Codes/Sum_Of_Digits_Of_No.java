package Loops;
import java.util.Scanner;
public class Sum_Of_Digits_Of_No {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x= sc.nextInt();
        int sum= 0;
        while(x!= 0){
            sum += x%10;
            x /= 10;
        }
        System.out.println((sum>0) ? sum : -sum);
    }
}

package Loops;
import java.util.Scanner;
public class Count_Digits {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x= sc.nextInt();
        int count;
        for(count= 0; x!= 0; count++){
            x /= 10;
        }
        System.out.println("The digits of the Number are:" + " " + count);
    }
}

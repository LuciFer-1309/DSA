package Loops;

import java.util.Scanner;
public class Composite_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Composite Number");
                sc.close();
                return;
            }
        }
        System.out.println("Not a Composite Number");
        sc.close();
    }
}




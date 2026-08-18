package Loops;

import java.util.Scanner;

public class Geometric_Progression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 1, r = 2;
        System.out.print("Enter the n terms:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
    }
}

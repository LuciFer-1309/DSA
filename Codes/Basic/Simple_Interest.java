package Basic;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
        double Principal= sc.nextDouble();
        System.out.print("Enter Rate:");
        double Rate= sc.nextDouble();
        System.out.print("Enter Time:");
        double Time= sc.nextDouble();
        double SI= Principal*Rate*Time/100;
        System.out.print("SI:" + SI);
    }
}

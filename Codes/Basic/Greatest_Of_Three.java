package Basic;

import java.util.Scanner;
public class Greatest_Of_Three {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int x= sc.nextInt();
        System.out.print("Enter the Second Number:");
        int y= sc.nextInt();
        System.out.print("Enter the Third Number:");
        int z= sc.nextInt();
        if(x>=y && x>=z){
            System.out.println("The First Number is the greatest" + " " + x);
        }
        else if(y>=x && y>=z){
            System.out.println("The Second Number is the greatest" + " " + y);
        }
        else{
            System.out.println("The Third Number is the greatest" + " " + z);
        }
    }
}

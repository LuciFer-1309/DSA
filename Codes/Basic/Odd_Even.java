package Basic;

import java.util.Scanner;
public class Odd_Even {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
                System.out.print("Enter the Number:");
                int x= sc.nextInt();
                if(x%2 == 0){
                    System.out.println("It is an Even Number");
                }
                else{
                    System.out.println("It is a Odd Number");
                }
    }
}

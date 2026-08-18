package Basic;

import java.util.Scanner;
public class Four_Digit_Number {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x= sc.nextInt();
        if(x>999 && x<10000){
            System.out.println("The Number is 4 digit number");
        }
        else{
            System.out.println("The Number is not a 4 digit number");
        }
    }
}

package Basic;

import java.util.Scanner;
public class Check_Divisiblity {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x= sc.nextInt();
        if(x%5 == 0 && x%3 == 0){
            System.out.println("The number is divisible by 5 and 3 is" + " " + x);
        }
        else if(x%3 == 0){
            System.out.println("The number is divisible by 3 is" + " " + x);
        }
        else if(x%5 == 0){
            System.out.println("The number is divisible by 5 is" + " " + x);
        }
        else{
            System.out.println("The number is either divisible by 5 or 3 is" + " " + x);
        }
    }
}

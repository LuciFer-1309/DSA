package Basic;

import java.util.Scanner;
public class Absolute_Value {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the NUmber:");
        int x= sc.nextInt();
        if(x<0){
            x= -x;
        }
        System.out.println("Absolute Number is:" + x);
    }
}

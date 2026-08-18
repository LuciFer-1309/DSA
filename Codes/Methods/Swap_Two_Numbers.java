package Methods;
import java.util.Scanner;
public class Swap_Two_Numbers {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter First Number:");
        int x= sc.nextInt();
        System.out.print("Enter Second Number:");
        int y= sc.nextInt();
        int z= x;
        x=y;
        y=z;
        System.out.print(x + " " + y);
    }
}

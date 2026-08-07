package Methods;
import java.util.Scanner;
public class Max_Of_Three {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int x= sc.nextInt();
        System.out.print("Enter the Second Number:");
        int y= sc.nextInt();
        System.out.print("Enter the Third Number:");
        int z= sc.nextInt();
        System.out.println(Math.max(Math.max(x,y),z));
    }
}

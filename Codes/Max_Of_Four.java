package Methods;
import java.util.Scanner;
public class Max_Of_Four {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int w= sc.nextInt();
        System.out.print("Enter the Second Number:");
        int x= sc.nextInt();
        System.out.print("Enter the Third Number:");
        int y= sc.nextInt();
        System.out.print("Enter the Fourth Number:");
        int z= sc.nextInt();
        System.out.println(Math.max(Math.max(Math.max(w,x),y),z));
    }
}

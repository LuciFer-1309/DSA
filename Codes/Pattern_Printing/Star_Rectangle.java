package Pattern_Printing;
import java.util.Scanner;
public class Star_Rectangle {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row= sc.nextInt();
        for(int i=1; i<=row; i++){
            System.out.println("*****");
        }
    }
}

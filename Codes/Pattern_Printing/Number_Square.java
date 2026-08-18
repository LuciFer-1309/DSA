package Pattern_Printing;
import java.util.Scanner;
public class Number_Square {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int x= sc.nextInt();
        for(int i=1; i<=x; i++) {
            for(int j=1; j<=x; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

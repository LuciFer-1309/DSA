import java.util.Scanner;
public class Print_n_To_1 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n Number:");
        int n= sc.nextInt();
        for(int i=n; i<=1; i++) {
            System.out.println("The Number is" + " " + i);
        }
    }
}

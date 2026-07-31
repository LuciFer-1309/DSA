import java.util.Scanner;
public class Arithmetic_Progression {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter nth Term:");
        int n= sc.nextInt();
        for(int i=2; i<= 3*n-1; i+=3) {
            System.out.println("The AP is:" + " " + i);

        }
    }
}

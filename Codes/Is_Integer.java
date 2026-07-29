import java.util.Scanner;

public class Is_Integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        double n = sc.nextDouble();

        if (n == (int) n) {
            System.out.println("The Number is Integer");
        } else {
            System.out.println("The Number is not an Integer");
        }
    }
}

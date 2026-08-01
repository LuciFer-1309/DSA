import java.util.Scanner;

public class Print_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n terms:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            if (i != n - i + 1) {
                System.out.println(n - i + 1);
            }
            if (i >= n - i + 1) {
                break;
            }
        }
    }
}

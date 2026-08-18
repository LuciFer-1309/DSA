package Arrays;
import java.util.Scanner;
public class Print_Elements_Product {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[4];
        System.out.print("Enter the array elements:");
        for(int i=0; i<4; i++) {
            arr[i]= sc.nextInt();
        }
        int prod= 1;
        for(int i=0; i<4; i++) {
            prod *= arr[i];
        }
        System.out.print(prod);
    }
}

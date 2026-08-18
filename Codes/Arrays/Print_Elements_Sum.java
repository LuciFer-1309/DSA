package Arrays;
import java.util.Scanner;
public class Print_Elements_Sum {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[4];
        System.out.print("Enter the array elements:");
        for(int i=0; i<4; i++) {
            arr[i]= sc.nextInt();
        }
        int sum= 0;
        for(int i=0; i<4; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}

package Arrays;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("The element exists");
                break;
            }
            else if(i == arr.length - 1) {
                System.out.println("The element does not exists");
            }
        }
    }
}
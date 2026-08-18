package Arrays;
import java.util.Scanner;
public class Array_Search {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[6];
        System.out.print("Enter the array elements:");
        for(int i=0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the arrays element:");
        int n= sc.nextInt();
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == n) {
                System.out.println("The element exists");
                break;
            }
            if(i == arr.length -1) {
                System.out.println("The element does not exists");
            }
        }
    }
}

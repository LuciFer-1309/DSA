package Arrays;
import java.util.Scanner;
public class Multiply_Add_Elements_Of_Array {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[6];
        System.out.print("Enter the elements of array:");
        for(int i=0; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i< arr.length; i++) {
            if(i%2 == 0) {
                arr[i] += 10;
            }
            else {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

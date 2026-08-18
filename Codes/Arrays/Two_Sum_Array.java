package Arrays;
import java.util.Scanner;
public class Two_Sum_Array {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array:");
        int[] arr= new int[5];
        for(int i=0; i< arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target= sc.nextInt();
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                if(arr[i]+arr[j] == target) {
                    System.out.print(target);
                }
            }
        }
    }
}


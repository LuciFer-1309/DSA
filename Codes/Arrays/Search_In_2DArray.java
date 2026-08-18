package Arrays;
import java.util.Scanner;
public class Search_In_2DArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(arr[i][j] == x) {
                    System.out.println(x + " is present at index [" + i + "][" + j + "]");
                }
            }
        }
    }
}
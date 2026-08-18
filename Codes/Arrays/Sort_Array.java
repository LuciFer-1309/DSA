package Arrays;
import java.util.Arrays;
public class Sort_Array {
    public static void main(String args[]) {
        int[] arr= {1,9,32,56,12,90};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] x) {
        for(int i=0; i<x.length ; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

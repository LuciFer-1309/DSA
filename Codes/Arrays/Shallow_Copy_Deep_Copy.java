package Arrays;
import java.util.Arrays;
public class Shallow_Copy_Deep_Copy {
    public static void main(String args[]) {
        int[] arr= {10,20,30,40,50};
        int[] x= arr;
        x[2]= 100; // shallow copy of arr
        System.out.println(arr[2]);
        int[] y= Arrays.copyOf(arr, arr.length); // deep copy
        y[2]= 19;
        System.out.println(y[2]);
    }
}

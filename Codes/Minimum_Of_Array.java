package Arrays;
public class Minimum_Of_Array {
    public static void main(String args[]) {
        int[] arr= {1,2,3,4,5,6,7};
        int min= Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++) {
            if(arr[i]<min) {
                min= arr[i];
            }
        }
        System.out.print(min);
    }
}

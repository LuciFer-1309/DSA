package Methods;
import java.util.Scanner;
public class Permutation_Combination {
    public static int fact(int x) {
        int f=1;
        for(int i=1; i<=x; i++) {
            f *= i;
        }
        return f;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n:");
        int n= sc.nextInt();
        System.out.print("Enter the r:");
        int r= sc.nextInt();

        int nFact=1;
        for(int i=1; i<=n; i++) {
            nFact *= i;
        }

        int rFact=1;
        for(int j=1; j<=r; j++) {
            rFact *= j;
        }
        int ncr= (nFact)/((rFact)*fact(n-r));
        int npr= (nFact)/fact(n-r);
        System.out.println(ncr);
        System.out.println(npr);
    }
}

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        double l = sc.nextDouble();
        System.out.print("Enter breadth:");
        double b = sc.nextDouble();
        System.out.print("Enter height:");
        double h = sc.nextDouble();
        double volume = 2 * (l * b + b * h + l * h);
        System.out.print("Volume of Sphere:" + volume);
    }
}

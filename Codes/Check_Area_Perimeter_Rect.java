import java.util.Scanner;
public class Check_Area_Perimeter_Rect {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle:");
        int l= sc.nextInt();
        System.out.print("Enter the Breadth of Rectangle:");
        int b= sc.nextInt();
        int area= l*b;
        int perimeter= 2*(l+b);
        if(area > perimeter){
            System.out.println("The Area of Rectangle is greater than its Perimeter");
        }
        else{
            System.out.println("The Area of Rectangle is not greater than its Perimeter");
        }
    }
}

import java.util.Scanner;
public class Profit_Loss {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
            System.out.print("Enter the Cost Price:");
            int cp= sc.nextInt();
            System.out.print("Enter the Selling Price:");
            int sp= sc.nextInt();
            if(sp > cp){
                System.out.println("We made Profit");
            }
            else if(sp == cp){
                System.out.println("There was neither Profit nor Loss");
            }
            else{
                System.out.println("We made Loss");
        }
    }
}

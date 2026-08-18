package Methods;
public class Method_Calling {
    public static void Ronaldo() {
        System.out.println("Madrid");
        Messi();
    }
    public static void Messi() {
        System.out.println("Barca");
        Neymar();
    }
    public static void Neymar() {
        System.out.println("Santos");
    }
    public static void main(String args[]) {
        Ronaldo();
    }
}

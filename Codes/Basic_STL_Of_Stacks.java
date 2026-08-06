package Stacks;
import java.util.Stack;
public class Basic_STL_Of_Stacks {
    public static void main(String args[]) {
        Stack<String> st= new Stack<>();
        st.push("Ronaldo");
        st.push("Messi");
        st.push("Zizou");
        st.push("Neymar Jr.");
        st.push("Ronaldinho");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop()); //it returns topmost element and then removes it
        System.out.println(st);
    }
}

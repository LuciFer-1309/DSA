package Stacks;
import java.util.Stack;
public class Push_At_Bottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int element = 50;
        System.out.println("Original Stack : " + st);
        pushAtBottom(st, element);
        System.out.println("After Push at Bottom : " + st);
        reverse(st);
        System.out.println("Reversed Stack : " + st);
    }

    public static void pushAtBottom(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, element);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
}
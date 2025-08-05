import java.util.Stack;
public class StackClass {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        //push
        st.add(100);
        st.add(200);
        st.add(300);
        System.out.println("stack elements : "+st);

        //peek & pop
        int top = st.peek();
        System.out.println("Top element : "+top);
        int popped = st.pop();
        System.out.println("popped element : "+popped);

        //check
        boolean empty = st.empty();
        System.out.println("is Empty ? : "+empty);
        int size = st.size();
        System.out.println("size : "+size);

        //Iterate (from bottom to top)
        System.out.println("st elements");
        for(Integer val : st){
            System.out.println(val);
        }

    }
}

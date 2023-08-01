package collections.list;

import java.util.Stack;

public class StackIntro {
   public static void main(String[] args){
       Stack<Integer> st= new Stack<>();
       st.push(1);
       st.push(133);
       st.push(192);
       st.push(183);
       st.push(122);
       st.push(1222);

       System.out.println(st);

       System.out.println(st.peek());

       System.out.println(st.pop());
       System.out.println(st);


   }
}

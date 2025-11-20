package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public MinStack() {
        st=new Stack();
        minst=new Stack();
    }

    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val<=minst.peek()){
            minst.push(val);
        }
    }

    public void pop() {
        if(st.size()==0) return;
        int rem=st.pop();
        if(rem==minst.peek()) minst.pop();
    }

    public int top() {
        return  st.peek();
    }

    public int getMin() {
        return minst.peek();
    }
}

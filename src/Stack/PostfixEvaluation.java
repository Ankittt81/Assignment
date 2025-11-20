package Stack;

import java.util.Stack;

public class PostfixEvaluation {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            char s=arr[i].charAt(0);
            if(arr[i].length()==1 && checkoperator(s)){
                int b=st.pop();
                int a=st.pop();
                int result=operation(a,b,s);
                st.push(result);
            }
            else {
                int d=Integer.parseInt(arr[i]);
                st.push(d);
            }
        }
        return st.pop();
    }
    boolean checkoperator(char s){
        if(s=='+' || s=='-' || s=='*' || s=='/' || s=='^') return true;
        return false;
    }
    int operation(int a,int b, char op){
        int result=0;
        switch(op){
            case'+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=(int)Math.floor((double)a / (double)b);;
                break;
            case '^':
                result=(int)Math.pow(a,b);
                break;
        }
        return result;
    }
}

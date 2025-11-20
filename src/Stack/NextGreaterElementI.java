package Stack;

import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int m=nums1.length;
        int[] next=new int[n];
        int[] ans=new int[m];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && nums2[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0) next[i]=-1;
            else next[i]=st.peek();
            st.push(nums2[i]);
        }
        int k=0;
        for(int num:nums1){
            for(int i=0;i<n;i++){
                if(num==nums2[i]){
                    ans[k++]=next[i];
                    break;
                }
            }
        }
        return ans;
    }
}

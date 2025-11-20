package TreeSet;

import java.util.TreeSet;

public class SmalleronLeft {
    public static int[] Smallestonleft(int arr[], int n) {
        // Complete the function
        int[] ans=new int[n];
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<n;i++){
            Integer lower=ts.lower(arr[i]);
            if(lower==null) ans[i]=-1;
            else ans[i]=lower;
            ts.add(arr[i]);
        }
        return ans;
    }
}

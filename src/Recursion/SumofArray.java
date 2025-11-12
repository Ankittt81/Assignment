package Recursion;

public class SumofArray {
    int arraySum(int arr[]) {
        // code here
        return sum(arr,0);
    }
    int sum(int[] arr,int idx){
        if(idx==arr.length) return 0;
        return arr[idx]+sum(arr,idx+1);
    }
}

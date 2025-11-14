package Sorting;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    void mergesort(int[] nums,int s,int e){
        if(s==e) return;
        int mid=(s+e)/2;
        mergesort(nums,s,mid);
        mergesort(nums,mid+1,e);
        merge(nums,s,mid,e);
    }
    void merge(int[] nums,int s,int m,int e){
        int[] c=new int[e-s+1];
        int p1=s;
        int p2=m+1;
        int k=0;
        while(p1<=m && p2<=e){
            if(nums[p1]<nums[p2]){
                c[k]=nums[p1];
                p1++;
                k++;
            }
            else{
                c[k]=nums[p2];
                p2++;
                k++;
            }
        }
        while(p1<=m){
            c[k]=nums[p1];
            p1++;
            k++;
        }
        while(p2<=e){
            c[k]=nums[p2];
            p2++;
            k++;
        }
        for(int i=0;i<c.length;i++){
            nums[i+s]=c[i];
        }
    }
}

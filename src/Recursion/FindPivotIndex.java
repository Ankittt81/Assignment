package Recursion;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int num:nums) totalsum+=num;
        return pivotidx(nums,0,0,totalsum);
    }
    int pivotidx(int[] nums,int idx,int leftsum,int totalsum){
        if(nums.length==idx) return -1;
        int rightsum=totalsum-nums[idx]-leftsum;
        if(leftsum==rightsum) return idx;
        return pivotidx(nums,idx+1,leftsum+nums[idx],totalsum);
    }
}

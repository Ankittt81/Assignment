package arrays;

public class MaximumProductSubarray {
    static int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            left*=nums[i];
            right*=nums[n-i-1];
            ans=Math.max(ans,Math.max(left,right));
            if(left==0) left=1;
            if(right==0) right=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxProduct(nums1));

    }
}

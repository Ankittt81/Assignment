package arrays;

public class MaximumSubarraySum {
    static int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>ans) ans=sum;
            if(sum<0) sum=0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums1));
    }
}

package arrays;

public class RunningSumof1dArray {
    static int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] prefixsum=new int[n];
        prefixsum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        return prefixsum;
    }
    public static void main(String[] args) {
      int[] nums = {3,1,2,10,1};
      int[] ans=runningSum(nums);
      for(int i=0;i<ans.length;i++){
          System.out.print(ans[i]+" ");
      }
    }
}

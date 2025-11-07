package arrays;

class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx=-1;
        int maxidx=-1;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minidx=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxidx=i;
            }
        }
        //4 strategies
        int front=Math.max(minidx+1,maxidx+1);
        int back=n-Math.min(minidx,maxidx);
        int way1=(minidx+1)+(n-maxidx);
        int way2=(maxidx+1)+(n-minidx);
        ans=Math.min(front,Math.min(back,Math.min(way1,way2)));
        return ans;
    }
}

public class Removeminandmax {
    public static void main(String[] args) {
        Solution s=new Solution();

        int[] nums = {0,-4,19,1,8,-2,-3,5};
        System.out.println(s.minimumDeletions(nums));
    }
}

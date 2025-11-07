package arrays;

public class MajorityElement {
    static int majorityElement(int[] nums) {
        int n=nums.length;
        int num=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0) {
                num=nums[i];
                count++;
            }
            else if(nums[i]==num) count++;
            else count--;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(majorityElement(nums1));
    }
}

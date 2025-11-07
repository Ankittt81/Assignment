package arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotatepart(0,n-1,nums);
        rotatepart(0,k-1,nums);
        rotatepart(k,n-1,nums);

    }
    static void rotatepart(int i,int j,int[] nums){
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
       int[] nums = {1,2,3,4,5,6,7};
       int k = 3;
       rotate(nums,k);
       for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]+" ");
       }
    }
}

package arrays;

public class CountElementswithMaximumFrequency {
    static int maxFrequencyElements(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int[] freq=new int[max+1];
        for(int num:nums){
            freq[num]++;
        }
        int maxfreq=0;
        int totalele=0;
        for(int i=0;i<freq.length;i++){
            if(maxfreq<freq[i]){
                maxfreq=freq[i];
                totalele=1;
            }
            else if(maxfreq==freq[i]) totalele++;
        }
        return maxfreq*totalele;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(nums));
    }
}

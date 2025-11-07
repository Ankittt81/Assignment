package arrays;

import java.util.HashSet;

public class IntersectionofTwoArrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums2){
            set.add(num);
        }
        HashSet<Integer> ans=new HashSet<>();

        for(int num:nums1){
            if(set.contains(num)) ans.add(num);
        }
        int[] result=new int[ans.size()];
        int idx=0;
        for(int num:ans){
            result[idx++]=num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
       int[] ans= intersection(nums1,nums2);
       for(int i=0;i<ans.length;i++){
           System.out.print(ans[i]+" ");
       }
    }
}

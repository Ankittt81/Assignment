package arrays;

import java.util.*;
public class Reversethearray {
    static void reverseArray(ArrayList<Integer> arr, int m) {
        int i=m+1;
        int j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10 ,4, 5, 2, 3, 6, 1, 3, 6));
        int m=3;
        reverseArray(list,m);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}

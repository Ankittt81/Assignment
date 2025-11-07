package arrays;

import java.util.HashMap;

public class findrepeatingelementanarray{
    static void findrepeatingelement(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!freq.containsKey(arr[i])) freq.put(arr[i],1);
            else freq.put(arr[i],freq.get(arr[i])+1);
        }
        for(int key:freq.keySet()){
            if(freq.get(key)>1) System.out.print(key);
        }
    }
    public static void main(String args[]){
        int[] Arr = {1,1,2,3,4,4,5,2};
        findrepeatingelement(Arr);
    }
}
package Strings;
import java.util.*;

public class MaximumNumberofOccurrencesofaSubstring {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String,Integer> countmap=new HashMap<>();
        HashMap<Character,Integer> charcount=new HashMap<>();
        int left=0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            charcount.put(c,charcount.getOrDefault(c,0)+1);

            if(right-left+1>minSize){
                char leftchar=s.charAt(left);
                charcount.put(leftchar,charcount.get(leftchar)-1);
                if(charcount.get(leftchar)==0) charcount.remove(leftchar);
                left++;
            }

            if(right-left+1==minSize && charcount.size()<=maxLetters){
                String sub=s.substring(left,right+1);
                countmap.put(sub,countmap.getOrDefault(sub,0)+1);
                maxfreq=Math.max(maxfreq,countmap.get(sub));
            }
        }
        return maxfreq;
    }
}

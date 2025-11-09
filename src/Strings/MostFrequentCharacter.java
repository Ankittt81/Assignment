package Strings;

public class MostFrequentCharacter {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        int maxi=-1;
        int maxfreq=0;
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                maxi=i;
            }
        }
        return (char)(maxi+'a');
    }
}

package Strings;

public class CountVowelsConsonantsAndSpaces {
    static int[] countVowelsConsonantsSpaces(String s, int n) {
        // Write your code here.
        int vowel=0;
        int cons=0;
        int space=0;

        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))) vowel++;
            else if(s.charAt(i)==' ') space++;
            else cons++;
        }
        int[] ans=new int[3];
        ans[0]=vowel;
        ans[1]=cons;
        ans[2]=space;
        return ans;
    }

    static boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') return true;
        return false;
    }

}

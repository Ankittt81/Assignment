package Strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z]","");
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }
}

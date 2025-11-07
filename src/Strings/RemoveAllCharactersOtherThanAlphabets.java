package Strings;

public class RemoveAllCharactersOtherThanAlphabets {
    String removeSpecialCharacter(String s) {
        // code here
        StringBuilder ans=new StringBuilder();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>=65 && c<=90) || (c>=97 && c<=122)) {
                ans.append(c);
                flag=true;
            }
        }
        if(!flag) return "-1";
        return ans.toString();
    }
}

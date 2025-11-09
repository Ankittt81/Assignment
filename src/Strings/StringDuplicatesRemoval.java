package Strings;

import java.util.HashSet;

public class StringDuplicatesRemoval {
    String removeDuplicates(String s) {
        HashSet<Character> seen=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(seen.add(c)) ans.append(c);
        }
        return ans.toString();
    }
}

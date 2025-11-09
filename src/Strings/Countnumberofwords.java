package Strings;

public class Countnumberofwords {
    int countWords(String s) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if current is backslash and next is 'n' or 't'
            if (c == '\\' && i + 1 < s.length() &&
                    (s.charAt(i + 1) == 'n' || s.charAt(i + 1) == 't')) {
                inWord = false; // separator found
                i++; // skip next character ('n' or 't')
            }
            else if (c == ' ') {
                inWord = false; // normal space separator
            }
            else { // lowercase letter
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            }
        }
        return count;
    }
}

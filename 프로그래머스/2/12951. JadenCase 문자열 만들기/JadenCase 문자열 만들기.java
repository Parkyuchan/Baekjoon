import java.io.*;

class Solution {
    public String solution(String s) {

        StringBuilder sb = new StringBuilder();
        boolean newWord = true;

        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(c);
                newWord = true;
            } else {
                if (newWord) {
                    sb.append(Character.isLetter(c) ? Character.toUpperCase(c) : c);
                    newWord = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        return sb.toString();
    }
}
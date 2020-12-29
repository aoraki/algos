package jk.codespace.solutions;

import java.util.StringTokenizer;

public class LengthOfLastWordSolution {

    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split("\\s+");
        String lastWord = "";
        if (arrOfStr.length > 0) {
            lastWord = arrOfStr[arrOfStr.length - 1];
        }
        return lastWord.length();
    }

    public int lengthOfLastWordUsingTokenizer(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String lastWord = "";
        while (st.hasMoreElements()) {
            lastWord = st.nextToken();
        }
        return lastWord.length();
    }
}
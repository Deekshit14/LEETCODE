// https://leetcode.com/problems/length-of-last-word/description/
package STRINGS;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        for (int i=s.length()-2; i>=0; i--)
        {
            if (s.charAt(i) == ' ')
                return s.length() - i - 1;
        }
        return s.length();
    }
}

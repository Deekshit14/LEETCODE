// https://leetcode.com/problems/reverse-prefix-of-word/
package STRINGS;

public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        if (!word.contains(String.valueOf(ch)))
            return word;
        StringBuilder s = new StringBuilder("");
        s.append(word.substring(0,word.indexOf(ch)+1));
        s.reverse();
        s.append(word.substring(word.indexOf(ch)+1, word.length()));
        return s.toString();
    }
}

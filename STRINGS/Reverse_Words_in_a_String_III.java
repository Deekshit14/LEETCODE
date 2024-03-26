// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
package STRINGS;

public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse(); 
            reversed.append(reversedWord).append(" "); 
        }
        return reversed.toString().trim();
    }
}

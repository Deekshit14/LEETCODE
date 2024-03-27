// https://leetcode.com/problems/merge-strings-alternately/
package STRINGS;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
    
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder("");
        int i=0;
        int j=0;
        while (i<word1.length() && j<word2.length())
        {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }
        
        while (i<word1.length())
        {
            merged.append(word1.charAt(i));
            i++;
        }

        while (j<word2.length())
        {
            merged.append(word2.charAt(j));
            j++;
        }
        return merged.toString();
    }
}

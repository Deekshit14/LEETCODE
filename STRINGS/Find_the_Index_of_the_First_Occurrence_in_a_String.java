// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package STRINGS;

public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static void main(String[] args) {
        // String haystack = "leetcode";
        // String needle = "leeto";
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));   
    }
    
    public static int strStr(String haystack, String needle) {
        StringBuilder s = new StringBuilder(haystack);
        return s.indexOf(needle);
    }
}

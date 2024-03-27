// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
package STRINGS;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones {
    public static void main(String[] args) {
        String s = "1001";
        // String s = "110";  
        System.out.println(checkOnesSegment(s));  // This will be true only if all '1' are before '0'
    }

    public static boolean checkOnesSegment(String s) {
        for (int i=1; i<s.length(); i++)
        {
            if (s.charAt(i) == '1' && s.charAt(i - 1) == '0')
                return false;
        }       
        return true;
    }
}

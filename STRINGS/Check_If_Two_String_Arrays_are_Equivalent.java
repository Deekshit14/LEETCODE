// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
package STRINGS;

public class Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder a = new StringBuilder("");
        StringBuilder b = new StringBuilder("");
        for (int i=0; i<word1.length; i++)
        {
            a.append(word1[i]);
        }
        for (int i=0; i<word2.length; i++)
        {
            b.append(word2[i]);
        }
        // if (a.compareTo(b) != 0)
        //     return false;
        // return true;
        return a.toString().equals(b.toString());
    }
}

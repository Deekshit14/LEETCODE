// https://leetcode.com/problems/break-a-palindrome/
package STRINGS;

public class Break_a_Palindrome {
    public static void main(String[] args) {
        String p = "abccba";
        // String p = "aa";
        System.out.println(breakPalindrome(p));
    }
    
    public static String breakPalindrome(String p) {
        char [] a = p.toCharArray();

        if (a.length<2)
            return "";
        
        for (int i=0; i<a.length/2; i++)    
    // Since it is a palindrome check only half string because next half of the string will be surely having same character since it is a paindrome Ex: aaabaaa
        {
            if (a[i] != 'a')
            {
                a[i] = 'a';
                return String.valueOf(a);
            }
        }
        // if all the elements are 'a' regardless of the middle element as follows
        a[a.length-1] = 'b';
        return String.valueOf(a);  
    }
}

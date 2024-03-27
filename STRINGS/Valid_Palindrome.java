// https://leetcode.com/problems/valid-palindrome/
package STRINGS;
public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while(right>=left) {
            if(!Character.isLetterOrDigit(s.charAt(left)))  
            {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))) 
            {
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right)) 
                return false;
            left++;
            right--;
        }
        return true;
    }

/*    
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        // StringBuilder str = new StringBuilder(s);
        // if (str.reverse().toString().equals(s))
            // return true;
        // return false;

        for (int i=0; i<s.length(); i++)
        {
            if ( s.charAt(i) != (s.charAt(s.length()-i-1)) )
                return false;
        }
        return true;
    }
*/
}

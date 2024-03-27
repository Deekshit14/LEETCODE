// https://leetcode.com/problems/longest-common-prefix/
package STRINGS;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        int start = 0;
        int end = strs[0].length();
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            String s = strs[0].substring(0,mid);
            if (possible(strs, s))
            {
                ans = s;
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return ans;
    }

    public static boolean possible(String [] strs, String s)
    {
        for (int i=0; i<strs.length; i++)
        {
            if (!strs[i].startsWith(s))
                return false;
        }
        return true;
    }
}

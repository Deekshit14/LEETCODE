// https://leetcode.com/problems/long-pressed-name/
package STRINGS;
public class Long_Pressed_Name {
    public static void main(String[] args) {
        // String name = "alex";
        // String typed = "aaleex";
        String name = "pyplrz";
        String typed = "ppyypllr";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int i=0;
        int j=0;
        while (j<typed.length())
        {
            if (name.length() > i && typed.charAt(j) == name.charAt(i))
                i++;
            else if (j==0 || typed.charAt(j) != typed.charAt(j-1))
                return false;
            j++;
        }
        return i==name.length();
    }

/* 
    public static boolean isLongPressedName(String name, String typed) {
        int m = name.length();
		int n = typed.length();
		int i = 0;
		for(int j = 0; j < n; j++)
        {
			if (i < m && typed.charAt(j) == name.charAt(i)) 
				i++;
			else if(j == 0 || typed.charAt(j) != typed.charAt(j - 1)) 
				return false;
		}
		return m == i;
    }       
*/
}

// https://leetcode.com/problems/excel-sheet-column-title/
package STRINGS;

/* A -> 1
   B -> 2
   C -> 3
   ...
   Z -> 26
   AA -> 27
   AB -> 28 
   ...    */

public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        // int columnNumber = 1;    A
        // int columnNumber = 28;  AB
        int columnNumber = 701;   // ZY
        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder("");
        while (columnNumber > 0)
        {
            int n = columnNumber % 26;
            if (n==0)
            {
                s.append('Z');
                columnNumber--;
            }
            else
                s.append((char)(n + 64));
            columnNumber /= 26;
        }
        return s.reverse().toString();
    }
}
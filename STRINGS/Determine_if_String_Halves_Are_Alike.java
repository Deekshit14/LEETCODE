// https://leetcode.com/problems/determine-if-string-halves-are-alike/
package STRINGS;

public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());

        return countVowels(a) == countVowels(b);
    }

    public static int countVowels(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') 
                count++;
        }
        return count;
    }
}

// https://leetcode.com/problems/maximum-repeating-substring/description/
package STRINGS;

public class Maximum_Repeating_Substring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }
    
    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String add = word;
        while(sequence.contains(word) == true) {
            count++;
            word += add;
        }
        return count;
    }
}

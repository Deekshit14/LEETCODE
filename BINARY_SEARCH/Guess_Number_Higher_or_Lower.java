package BINARY_SEARCH;

import java.util.Scanner;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess");
        int n = sc.nextInt();   /* The number should be greter than pickNumber in guess(int num) function 
                                oterwise we get -1 i.e, answer not found */
        System.out.println(guessNumber(n));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ans = guess(mid);
            if (ans == 0)
                return mid;
            else if (ans == -1)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // Simulate the external API
    public static int guess(int num) {
        // Replace this with the actual interaction with the external API
        int pickedNumber = 9;
        if (pickedNumber == num)
            return 0;
        else if (pickedNumber > num)
            return 1;
        else
            return -1;
    }
}

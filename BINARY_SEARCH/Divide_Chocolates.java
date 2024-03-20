// https://www.codingninjas.com/studio/problems/divide-chocolates_1466966?interviewProblemRedirection=true
package BINARY_SEARCH;

import java.util.* ;
import java.io.*; 
public class Divide_Chocolates {
	public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,6,7,8,9,10,11,12,13));
        int k = 3;
        int maxSweetness = getMaximumSweetness(arr, k);
        System.out.println("Maximum sweetness: " + maxSweetness);
    }
	public static int getMaximumSweetness(ArrayList<Integer> arr, int k) {
		int start = 0;
		int end = 0;
		for (int i=0; i<arr.size(); i++)
		{
			// start = Math.min(start, arr.get(i));
			end += arr.get(i);
		}
		int ans = 0;
		while (start <= end)
		{
			int mid = start + (end - start)/2;
			if (possible(arr, mid, k + 1))
			{
				start = mid + 1;
				ans = mid;
			}
			else 
				end = mid - 1;
		}
		return ans;
	}

	public static boolean possible(ArrayList<Integer> arr, int max, int k)
	{
		int count = 0;
		long sum = 0;	// sum should be declared as long
		for (int i=0; i<arr.size(); i++)
		{
			sum = sum + arr.get(i);
			if (sum >= max)
			{
				sum = 0;
				count++;
			}
		}
		return count >= k;
	}
}


//Longest Subarray of 1's After Deleting One Element

//Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
//Input: nums = [1,1,0,1]
//Output: 3
//Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

// again using sliding window and creating a dynamic window
class Solution {
    public int longestSubarray(int[] nums) {
        int sum = 0, count = 0;

        for (int i = 0, j= 0; j < nums.length; j++)
        {
            if (nums[j] == 0) count++;
            while (count > 1)
            {
                if (nums[i] == 0) count--;
                i++;
            }
            sum = Math.max(sum, j-i);
        }
        return sum;
    }
}

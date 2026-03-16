//Max Consecutive Ones III
//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//Output: 6
//Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

//Again using sliding window to find a dynamic window that contains 0 zeros and find the max length
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, count = 0;
        for (int i = 0, j = 0; j < nums.length; j++)
        {
            if (nums[j] == 0) count++;
            while (count > k)
            {
                if (nums[i] == 0) count--;
                i++;
            }

            max = Math.max(max, j-i+1);
        } 
        return max;
    }
}

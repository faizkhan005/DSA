//Maximum Average Subarray I
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
//Any answer with a calculation error less than 10-5 will be accepted.
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//using sliding window with two pointers
// i = 0; j = 0; ittirate over until we reach the window i,e k - 4 and find the avareage if the average is less move to left;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < nums.length)
        {
            sum += nums[j];
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k)
            {
                max = Math.max(max,sum);
                sum -= nums[i];
                i++;
                j++;
            }
        } 
        return (double) max/k;
    }
}

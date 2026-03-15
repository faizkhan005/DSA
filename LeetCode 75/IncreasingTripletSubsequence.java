//Increasing Triplet Subsequence
//Input: nums = [1,2,3,4,5]
//Output: true
//Explanation: Any triplet where i < j < k is valid.
// simple keep three tracker first second and last with max numbers;
// simple if statments if(arr[i] <= first) first = arr[i];
// else if (arr[i] <= second) second = arr[i]
// else return true; you have found 3 consecutive numbers that are in decreasing order
// if for loops exit the return false
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i : nums)
        {
            if(i <= first)
                first = i;
            else if (i <= second)
                second = i;
            else 
                return true;
        }
        return false;
    }
}

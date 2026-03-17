//Find the Highest Altitude
//Example 1:
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//Identify the prefix sum;
class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int highest = 0;
        for (int i : gain)
        {
            sum+= i;
            if(sum > highest)
                highest = sum;
        }
        return highest;
    }
}

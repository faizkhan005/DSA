//Container With Most Water
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, 
//the max area of water (blue section) the container can contain is 49.
// solution using two pointers i and j; i = 0 and j = arr.length-1;
// if i < j then increment i else decrement j
// calculate the area and return the max area;

class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int volume = 0;
        while (i<j)
        {
            int minHeight = height[i] < height[j] ? height[i] : height[j]; 
            int prod = minHeight * (j-i);
            if(prod > volume)
                volume = prod;
            if(height[i]< height[j])
                i++;
            else
                j--;
        }
        return volume;
    }
}

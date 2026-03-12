//Can Place Flowers
//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//Example 1:
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false

//sollution Ittirate over the array to find empty spaces
// for each item in arry find the prev and the next element consider prev to be 0 for start of array and next to be 0 for end of array 
//Time complexity O(n) space complexity O(1)

//Code:

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++)
        {
            if(flowerbed[i] == 0)
            {
                //find prev and next elements if i lies at start or end consider 0
                boolean emptyPrev = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyNext = (i == flowerbed.length -1) || (flowerbed[i+1] == 0);
                if(emptyPrev && emptyNext)
                {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count == n;
    }
}


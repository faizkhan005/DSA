//Product of Array Except Self
//Example
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
// return an algorithm that O(n) time complexity with O(1) space complexity.
// concept: we want to find the product of all the elements ecept itself, looking at the example we can just find the product and divide it by the current ith element
// and replace it we will have our solution.
// But problem states that we cannot use divide operator (/)
// so we use prefix and suffix we identify prefix product and store it in the result array (note: result array is excluded from space complexity)
// and then multiply suffix product with the prefix product to finally get the desired result.
//step by step explanation for the above example
// original array [1,2,3,4];
//prefix product for i = 0 ; 1 because there is nothing left of it and we dont need the current element in multiplication.
//prefix product for i = 1; 1 (because it has only one element left of it )
//prefix product for i = 2; (1*2 = 2)
//prefix product for i = 3; (1*2*3 = 6)
//final result array after finding out prefix product = [1,1,2,6]
//now lets find suffix product for this we start from end of array
// i = 3; 1 same as prefix product we have nothing on the left and we dont consider the number itself
// i = 2; 4 thats the only number to the right
// i = 1; 12(4*3)
// i = 0; 24 (4*3*2)
// final suffix product = [24,12,4,1]
// prifix product [1,1,2,6] suffix product [24,12,4,1]
// multiply both arrays that is multiply inde 0 of both arrays and so on to get final result
// i = 0; 1 * 24 = 24;
// i = 1; 1 * 12 = 12;
// i = 2; 2 * 4 = 8;
// i = 3; 6 * 1 = 6
// result array is [24,12,8,6] to do this in O(1) just store the prefix product in result array and then multiply and update the result array with suffix product
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] result = new int[nums.length];
        Arrays.fill(result,1);// new arrays are filled with 0 so replacing it with 1
        //calculating preifix product i,e product of all the numbers before current index 
        int prod = 1;
        for (int i = 0; i < nums.length; i++ )
        {
            result[i] *=prod; // result[i] = result[i] * prod;
            prod *= nums[i]; 
        }
        prod = 1;
        for(int i= nums.length -1; i>=0; i--)
        {
            result[i] *= prod;
            prod *= nums[i];
        }
        return result;
    }
}

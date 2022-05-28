class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int temp = nums[0];
        for(int i =0;i<nums.length;i++){
            if(temp == nums[i])
                count++;
            else if(count ==0){
                temp = nums[i];
                count ++;
            }
            else
                count--;
        }
    return temp;   
    }
}

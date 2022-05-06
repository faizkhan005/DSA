class Solution {
    public int findDuplicate(int[] nums) {
        //phase 1 
        int fast = nums[0];
        int slow = nums[0];
        //finding intersection points
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        //phase 2 sending slow to start
        slow = nums[0];
        
        while(slow!=fast){
            slow = nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}

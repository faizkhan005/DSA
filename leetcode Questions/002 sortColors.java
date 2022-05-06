class Solution {
    public void sortColors(int[] nums) {
        int zero_count = 0;
        int twos_count = nums.length-1;
        
        // counting 0s 2s;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zero_count++;
            if(nums[i]==2)
                twos_count--;
        }
      //rewriting the array 
        for(int i=0;i<nums.length;i++){
            if(zero_count!=0){
                nums[i]=0;
                zero_count--;
            }
            else if(i<=twos_count)
                nums[i]=1;
            else if(twos_count<nums.length){
                nums[i]=2;
                twos_count++;
            }
        }
    }
}

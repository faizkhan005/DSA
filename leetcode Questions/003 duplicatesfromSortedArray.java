class Solution {
    public int removeDuplicates(int[] nums) {
    int pos=1;
    int n=nums.length;
    for(int i=0;i<n-1;i++){
        if(nums[i]!=nums[i+1]){
            nums[pos]=nums[i+1];
            pos++;
        }
    }
    return pos;
        
    }
}

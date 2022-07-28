class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,j;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[correct])
                swap(nums,i,correct);
            else 
                i++;
        }
        for(j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                break;
        }
        return j+1;
    }
    public void swap(int[] arrs,int first,int last){
        int temp = arrs[first];
        arrs[first]= arrs[last];
        arrs[last] = temp;
    }
}

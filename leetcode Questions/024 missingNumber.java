class Solution {
    //using cyclic sort
    public int missingNumber(int[] nums) {
        int j,i=0;
        while(i<nums.length){
            
            if(nums[i]<nums.length && nums[i]!=i)
                swap(nums,i,nums[i]);
            else 
                i++;
                
        }
        for( j =0;j<nums.length;j++){
            if(nums[j]!=j)
               break;
        }if(j==nums.length-1)
            return j++;
        return j;
    }
    public void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

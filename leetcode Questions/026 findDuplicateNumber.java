class Solution {
    public int findDuplicate(int[] nums) {
        int j,i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else
                i++;
        }
        
        for( j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                break;
        }
         return nums[j];
    }
    public void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
   
}

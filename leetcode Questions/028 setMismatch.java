class Solution {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2];
        int j,i=0,k=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else
                i++;
        }
        
        for( j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
              ans[k++]=nums[j];
              ans[k++]=j+1;   
            }
        }
         return ans;
    }
    public void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
   
}

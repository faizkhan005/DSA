class Solution {
    public List<Integer> findDuplicates(int[] nums) {     
     int j,i=0;
        List<Integer> ans = new ArrayList<Integer>();
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else
                i++;
        }
        
        for( j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
               ans.add(nums[j]);
        }
         return ans;
    }
    public void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> found = new ArrayList<Integer>();
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct] ){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                found.add(j+1);
        }
        return found;
    }
    public void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}

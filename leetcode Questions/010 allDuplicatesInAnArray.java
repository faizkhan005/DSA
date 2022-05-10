class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<Integer>();
        for(int n: nums){
            n=Math.abs(n);
            if(nums[n-1]>0)nums[n-1]*=-1;
            else ans.add(n);
        }
        return ans;
    }
}

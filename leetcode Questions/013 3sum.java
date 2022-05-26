class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0)
            return res;
        Arrays.sort(nums);
        for( int i = 0 ; i < nums.length ; i++ ){
            for(int j = i + 1 ; j<nums.length; j++){
                int difference = target - (nums[i]+nums[j]);
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[left] + nums[right];
                    if(sum==difference){
                       List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        
                        while(left<right && nums[left]==quad.get(2)) ++left;
                        
                        while(left<right && nums[right]==quad.get(3)) --right;
                    }
                    else if(sum<difference) left++;
                    else right--;
                }
                while(j+1<nums.length &&nums[j]==nums[j+1]) ++j;        
            }
            while(i+1<nums.length && nums[i]==nums[i+1]) ++i;
        }
        return res;
    }
}

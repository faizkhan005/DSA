class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        
        // we using formula b+c=-a 
        // for loop below is used for identifying a 
        
        for(int i=0;i<nums.length-2;i++){   
            // i moves only till the last third element cause after that we wont find triplets 
            // to skip the same numbers 
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                
                int lo = i+1,hi=nums.length-1,sum=0-nums[i];
                // while loop to identify b and c i.e. using the method of two pointers 
                while(lo<hi){
                   if( nums[lo] + nums[hi] == sum){
                       result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                       while(lo < hi && nums[lo]==nums[lo+1]) lo++;
                       while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                       lo++; hi--;
                   } 
                    else if(nums[lo]+nums[hi]<sum)
                        lo++;
                    else hi--;
                }
            }
        }
        return result;
    }
}

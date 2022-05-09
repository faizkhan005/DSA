import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable <Integer,Integer>hash=new Hashtable<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                result[0] = i;
                result[1] =hash.get(target-nums[i]);
                return result;
            }
            hash.put(nums[i],i);
        }
        result[0]=-1;
        return result;
    }
}

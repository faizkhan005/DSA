import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int ans=0;
        int cum=0;
        hash.put((cum%k),1);
        for(int i=0;i<nums.length;i++){
            cum +=nums[i];
            int remainder = cum%k; 
            if(remainder<0)
                remainder +=k;// when we divide negative number we get negative remainder convert that to positive to use formal reminder
            if(hash.containsKey(remainder)){
                ans +=hash.get(remainder);
                
            }
            hash.put(remainder,hash.getOrDefault(remainder,0)+1);
        }
        return ans;
    }
}

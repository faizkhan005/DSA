class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outter = new ArrayList<>();
        
        outter.add(new ArrayList<>());
        for(int num : nums){
            int n = outter.size();
            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList<>(outter.get(i));
                inner.add(num);
                outter.add(inner);
            }
        }
        
        return outter;
    }
}

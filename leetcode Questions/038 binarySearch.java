class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    
    public int binarySearch(int[] arr, int target,int s,int e){
        if(s>e) return -1;
        int m = s+(e-s)/2;
        
        if(arr[m]==target) return m;
        else if(target<arr[m]) return binarySearch(arr,target,s, m-1);
        else return binarySearch(arr,target,m+1,e);
    }
}

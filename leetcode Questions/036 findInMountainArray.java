/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start =0;
        int end = mountainArr.length()-1;
        while(start!=end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
                start = mid+1;
            else 
                end = mid;
        }
        // to search in left part
        int ans = binarySearch(mountainArr,0,end,target);
        if(ans !=-1)
            return ans; 
        // to search in right part 
        else 
            return binarySearchd(mountainArr,end,mountainArr.length()-1,target);
    }
    public int binarySearch(MountainArray arr,int start, int end,int target){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr.get(mid)<target)
                start = mid+1;
            else if(arr.get(mid)>target)
                end = mid-1;
            else
                return mid;
        }
        return -1;
    }
    public int binarySearchd(MountainArray arr,int start, int end,int target){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr.get(mid)<target)
                end = mid-1;
            else if(arr.get(mid)>target)
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}

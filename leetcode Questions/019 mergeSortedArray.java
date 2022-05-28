// brute force method 
// time complexity of O((m+n) log n)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=0;i<nums1.length;i++){
            if(nums1[i]==0 && n>0 && j<nums2.length){
                nums1[i]= nums2[j];
                j++;
            }
        }
         Arrays.sort(nums1);
    }
}

//optimized solutin 
// time complexity of O(m+n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if n==0 no sorting needed nums1 is the answer
        if(n!=0){
            int[] temp = new int[m];
            for(int i=0;i<m;i++){
                temp[i]=nums1[i];
            }
            
            // merge n sort
            // j pointer for temp and k pointer for nums2
            int j=0 , k=0 ;
            for(int i=0; i<m+n;i++){
                if(k>=n || (j < m && temp[j] <= nums2[k] ) ){
                    nums1[i] = temp[j];
                    j++;
                }
                else if( j>=m || (k < n && nums2[k] <= temp[j] )){
                    nums1[i] = nums2[k];
                    k++;
                }
            }
        }
    }
}

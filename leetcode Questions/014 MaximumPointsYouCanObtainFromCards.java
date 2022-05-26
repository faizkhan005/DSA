class Solution {
    public int maxScore(int[] a, int k) {
      int window = a.length - k;
        int arrsum = 0;
    for(int i = 0 ; i < window ; ++i){
        arrsum += a[i];
    }
        int currsum = arrsum;
        int minsum = currsum;
    for(int i = window; i <= a.length -1; ++i){
        currsum += a[i] - a[i-window];
        minsum = Math.min(minsum,currsum);
        arrsum += a[i];
    }
        return arrsum - minsum;
    }
}

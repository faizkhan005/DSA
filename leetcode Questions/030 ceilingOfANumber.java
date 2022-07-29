public class ceilingOfAGivenNumber {
    //ceiling = smaleest element in an array greater than or = target
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
       System.out.println(search(arr,17));
       System.out.println(binarySearch(arr,17)); 
    }

    public static int search(int[] arr,int target){
        for(int i=0 ;i<arr.length;i++){

            if(arr[i]>=target )
                return arr[i];
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target)
                return arr[mid];
            if(arr[mid]<target)
                start = mid+1;
            else 
                end = mid-1;
            
        }
        return arr[start];
    }
}

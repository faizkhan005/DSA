public class floorOfANumber {
    //floor = greatest number thata is smaller of equal to target number 
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        System.out.println(binarySearch(arr, 17));
    }
    public static int binarySearch(int[] arr,int target ){
        int start =0;
        int end = arr.length-1;;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target == arr[mid])
                return arr[mid];
            else if(target>arr[mid])
                start = mid+1;
            else 
                end = mid-1;
        }
        return arr[end];
    }
}

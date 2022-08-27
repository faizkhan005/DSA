public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4,5,8};
        System.out.println(search(nums,0,5));
        System.out.println(search1(nums,0,5));
    }

    static boolean search(int[] arr, int i, int target){
        if(i == arr.length) return false;
        return arr[i] == target || search(arr,i+1,target);
    }
    static int search1(int[] arr,int i,int target){
        if(i == arr.length) return -1;

        if(arr[i] == target){
            return i;
        }
        else{
            return search1(arr,i+1,target);
        }
    }
    
}

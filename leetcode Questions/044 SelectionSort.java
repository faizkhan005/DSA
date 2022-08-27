import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1,5,4,6,2,7,8,9};
        sort(nums,0,nums.length-1,0);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr,int s, int e,int max){
        if(e ==0) return;
        if(s<=e){
            if(arr[s]>arr[max]){
                max = s;
            }
            sort(arr,s+1,e,max);
        }
        else{
            int temp = arr[max];
            arr[max] =arr[e];
            arr[e] = temp;
            sort(arr,0,e-1,0);
        }
    }
}

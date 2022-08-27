import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr = {1,2,5,4,3};
       sort(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr)); 
    }

    static void sort(int[] arr,int s,int e){
        if(e == 0) return ;

        if(s<e ){
            if(arr[s]>arr[s+1]){
                int temp = arr[s];
                arr[s] = arr[s+1];
                arr[s+1] = temp;
            }
            sort(arr,s+1,e);
        }
        else{
            sort(arr,0,e-1);
        }
    }
}

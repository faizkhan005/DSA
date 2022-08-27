import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,4,5,8};
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(search(nums,0,5));
        System.out.println(search1(nums,0,5));
        findAllIndex(nums, 0,5);
        System.out.println(findAllIndex(nums, 0,5,list1));
        System.out.println(findAllIndex1(nums, 0,5));
        System.out.println(list);
    }
    // return true when the target is found else returns false
    static boolean search(int[] arr, int i, int target){
        if(i == arr.length) return false;
        return arr[i] == target || search(arr,i+1,target);
    }
    // return the index of the target if found else returns -1
    static int search1(int[] arr,int i,int target){
        if(i == arr.length) return -1;

        if(arr[i] == target){
            return i;
        }
        else{
            return search1(arr,i+1,target);
        }
    }
    // to find all the elements that are equal to target  
    static ArrayList<Integer> list = new ArrayList<>(); 
    static void findAllIndex(int[] arr,int i,int target){
        if(i == arr.length) return ;

        if(arr[i] == target){
            list.add(i);
            findAllIndex(arr,i+1,target);
        }
        else{
            findAllIndex(arr,i+1,target);
        }
    }
    // second type
    static ArrayList<Integer> findAllIndex(int[] arr,int i,int target,ArrayList<Integer> list){
        if(i == arr.length) return list;

        if(arr[i] == target){
            list.add(i);
        }

        return findAllIndex(arr,i+1,target,list);

    }
    // third type 
    static ArrayList<Integer> findAllIndex1(int[] arr,int i,int target){
       ArrayList<Integer> ans = new ArrayList<>();
        if(i == arr.length) return ans;
        // this will contain the answer for that function call only 
        if(arr[i] == target){
            ans.add(i);
        }

        
        ArrayList<Integer> ansFromBelowFUnctionCalls = findAllIndex1(arr,i+1,target);
        ans.addAll(ansFromBelowFUnctionCalls);
        return ans;
    }
    
}

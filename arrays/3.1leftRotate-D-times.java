import java.util.ArrayList;
public class Solution {
    public static void reverse(ArrayList<Integer> arr,int s,int e){
        while(s<=e){
            int temp = arr.get(s);
            arr.set(s,arr.get(e));
            arr.set(e,temp);
            s++;
            e--;
        }
    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        reverse(arr, 0, k-1); // for right rotation use 0,n-k-1
        reverse(arr, k, n-1); // for right rotation use n-k,n-1
        reverse(arr, 0, n-1);
        return arr;
    }
}

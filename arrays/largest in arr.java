import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){max=arr[i];}
            // System.out.println(max);
        }
        return max;
    }
}

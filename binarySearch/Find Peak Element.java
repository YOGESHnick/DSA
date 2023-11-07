import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int s =0;
        int e = arr.size()-1;
        if(arr.get(0)>arr.get(1)){
            return 0;
        }
        if(arr.get(arr.size()-1)>arr.get(arr.size()-2)){
            return arr.size()-1;
        }
        while(e>=s){
            int mid=s+(e-s)/2;
            if((arr.get(mid)>arr.get(mid+1)) && (arr.get(mid)>arr.get(mid-1))){
                return mid;
            }
            else if(arr.get(mid)<arr.get(mid+1)){
                s=mid+1;
            }
            else {
                e =mid-1;
            }
        }
        return 1;
    }
};

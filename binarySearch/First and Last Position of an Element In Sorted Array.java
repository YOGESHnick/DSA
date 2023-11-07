import java.util.*;
 public class Solution {
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] ans = {-1,-1};
        int s =0;
        int e = n-1;
        int sindex =-1;
        while(e>=s){
            int mid = s+(e-s)/2;
            if(arr.get(mid)==k){
                sindex=mid;
                e = mid-1;
            }
            else if(arr.get(mid)>k){
                 e = mid-1;
            }else {
                s = mid+1;
            }
        }
        int eindex=-1;
            s =0;
            e =n-1;
         while(e>=s){
            int mid = s+(e-s)/2;
            if(arr.get(mid)==k){
                eindex=mid;
                s= mid+1;
            }
            else if(arr.get(mid)>k){
                 e = mid-1;
            }else {
                s = mid+1;
            }
        }
        ans[0]=sindex;
        ans[1]=eindex;
        return ans;
    }
};


public class Solution {
    public static int findKRotation(int []arr){
      int s =0;
      int e = arr.length-1;
      int minel = Integer.MAX_VALUE;
      int ans =0;
      while(e>=s){
           int mid = s+(e-s)/2;
           if(arr[mid]<=arr[e]){
               if(minel>arr[mid]){
                  minel=arr[mid];
                  ans =mid;
               }
               e =mid-1;
           } else if(arr[mid]>arr[e]){
               s = mid+1;
           }
      } 
 return ans;
    }
}

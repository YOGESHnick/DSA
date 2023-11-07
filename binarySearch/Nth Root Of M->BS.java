public class Solution {
    public static int NthRoot(int n, int m) {
        int i =1;
        int j = m;
        while(i <= j){
            int mid = i+(j-i)/2;
            int val = (int)Math.pow(mid,n);
            if(val == m)return mid;
            if(val > m){
                j = mid-1;
            }else i = mid+1;
        }
        return -1;
    }
}

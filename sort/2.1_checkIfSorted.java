public class Solution {
    public static int isSorted(int n, int []A) {
        for(int i=1;i<n-1;i++){
            if(A[i] < A[i-1]){return 0;}
        }
        return 1;
    }
}

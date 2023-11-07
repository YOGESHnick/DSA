public class Solution {
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n>0){
            return (double)x*myPow(x, n-1);
        }
        if(n<0){
            return (double)1.0/x*myPow(x, n+1);
        }
        return 0.0;
    }
}

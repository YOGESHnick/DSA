class Solution
{
        
    long power(int N,int R)
    {
        if(R==0) return 1;
        if(R==1) return N;
        if(R%2 == 0){
            long halfPow = power(N, R/2);
            return (long)(halfPow*halfPow)%1000000007;
        } 
        else {
            return (long)(N*power(N,R-1))%1000000007;
        }
    }
}

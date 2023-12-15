class Solution {
    static int isPerfectNumber(long N) {
        long sum=0;
        for(long i=1;i<=Math.sqrt(N);i++)
        {
            if(N%i==0)
            {
                if(i==N/i)
                sum=sum+i;
                else
                sum=sum+i+N/i;
            }
        }
        sum=sum-N;
        if(sum==N)
        return 1;
        return 0;
    }
};

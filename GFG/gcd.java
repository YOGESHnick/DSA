class Solution
{
     public int gcd(int A , int B) 
    { 
        int a=A;
        int b=B;
        if(a==0){return a;}
        if(b==0){return b;}
        if(a==b){return a;}
        if(a<b){return gcd(b,b-a);}
        return gcd(a-b,b);
    } 
}

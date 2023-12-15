class Solution {
    static String armstrongNumber(int n){
        int g=n;
        int num=0;
        while(n>0)
        {
            int x = (n%10)*(n%10)*(n%10);
            n=n/10;
            num=num+x;
        }
        if(num==g)return "Yes";
        else return "No";
    }
}

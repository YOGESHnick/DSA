class Solution
{
    public String is_palindrome(int n)
{
    int sum = 0, temp = n;
    while(temp>0){
        int a = temp%10;
        sum = sum*10 + a;
        temp /= 10;
    }
    
    if(sum == n) return "Yes";
    else return "No";
    
}
}

public class Solution
{
     public static int[] printNos(int x) {
        int[] arr = new int[x];
        helper(arr,x);
        return arr;
    }
    public static void helper(int[] arr,int x){
        if(x<=0) return;    
        arr[arr.length-x]=x;   
        helper(arr,x-1);   
    }
}

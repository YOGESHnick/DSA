public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        helper(nums,0,nums.length-1);
        return nums;
    }
    public static void helper(int[] arr,int i,int j){
        if(i==j || i>j) return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        helper(arr,i+1,j-1);
    }
}

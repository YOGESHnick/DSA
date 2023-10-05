class Solution{

    long maxSubarraySum(int arr[], int n){
        long sum=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum>=0){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}
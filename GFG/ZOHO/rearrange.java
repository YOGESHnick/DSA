class Solution{
    public static void rearrange(long arr[], int n){
        Arrays.sort(arr);
        int left = 0; 
        int right = n-1;
        long[] ans = new long[n];
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                ans[i] = arr[right];
                right--;
            }else{
                ans[i] = arr[left];
                left++;
            }    
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}

class Solution {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        if(n==0) return 0;
        
        Arrays.sort(arr);
        
        // initial differences
        int result=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        
        if (smallest > largest) {
            int temp = smallest;
            smallest = largest;
            largest = temp;
        }
        
        for(int i=0;i<n-1;i++){
            int minHeight=Math.min(smallest,arr[i+1]-k);
            int maxHeight=Math.max(largest,arr[i]+k);
            
            if(minHeight<0) continue;
            result = Math.min(result, maxHeight - minHeight);
        }
        return result;
    }
}

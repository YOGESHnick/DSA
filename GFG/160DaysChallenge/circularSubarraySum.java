class Solution {

    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        // Step 1: Find the maximum subarray sum using Kadane's algorithm
        int maxKadane = kadane(arr, n);
        // Step 2: Find the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        // Step 3: Find the minimum subarray sum using modified Kadane's algorithm
        // Flip signs of the elements temporarily to reuse Kadane
        for (int i = 0; i < n; i++) {
            arr[i] = -arr[i];
        }
        int minKadane = kadane(arr, n);
        // Restore the original array
        for (int i = 0; i < n; i++) {
            arr[i] = -arr[i];
        }
        // Step 4: Calculate the maximum circular sum
        int maxCircular = totalSum + minKadane; // totalSum - (-minKadane)

        // Step 5: Return the maximum of maxKadane and maxCircular
        // Edge case: If all numbers are negative, maxCircular may become 0. 
        // In that case, return maxKadane.
        if (maxCircular == 0) {
            return maxKadane;
        }
        return Math.max(maxKadane, maxCircular);
    }

    // Helper function to calculate maximum subarray sum using Kadane's algorithm
    private int kadane(int[] arr, int n) {
         int sum=arr[0],max=arr[0];
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

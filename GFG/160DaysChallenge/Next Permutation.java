class Solution {
    void nextPermutation(int[] arr) {
        // 1. find break point arr[i]<arr[i+1], ind
        // 2. swap arr[index] with next greatest element
        // 3. reverse arr from index+1 to last (right half)
        
        // 1. find break point arr[i]<arr[i+1], index
        int index=-1;
        int l=arr.length;
        for(int i=l-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        // if breakpoint is not found, return reverse of array
        if(index==-1){
            reverse(arr,0,l-1);
            return;
        }
        // 2. swap arr[index] with next greatest element
        for(int i=l-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        // 3. reverse arr from index+1 to last (right half)
        reverse(arr,index+1,l-1);
    }
    static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}

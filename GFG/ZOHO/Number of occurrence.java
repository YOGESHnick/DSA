class Solution {
    int count(int[] arr, int n, int x) {
        int firstOccurrence = findFirstOccurrence(arr, x);
        int lastOccurrence = findLastOccurrence(arr, x);
        
        if (firstOccurrence == -1 || lastOccurrence == -1) {
            return 0;
        } else {
            return lastOccurrence - firstOccurrence + 1;
        }
    }
    int findFirstOccurrence(int[] arr, int x){
        int low=0,high=arr.length-1;
        int firstOccurrence = -1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==x){
                firstOccurrence=mid;
                high=mid-1;
            }else if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return firstOccurrence;
    }
    
    int findLastOccurrence(int[] arr, int x){
        int low=0,high=arr.length-1;
        int lastOccurrence = -1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==x){
                lastOccurrence=mid;
                low=mid+1;
            }else if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return lastOccurrence;
    }
}

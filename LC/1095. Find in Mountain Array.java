class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peakIndex = findPeakIndex(mountainArr);
        
        int left = binarySearchAscending(mountainArr, target, 0, peakIndex);
        if (left != -1) {
            return left;
        }
        int right = binarySearchDescending(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
        return right;
    }
    
    // Helper function to find the peak index in the mountain array
    private int findPeakIndex(MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;            
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    // Helper function for binary search on the ascending part of the mountain
    private int binarySearchAscending(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // Helper function for binary search on the descending part of the mountain
    private int binarySearchDescending(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

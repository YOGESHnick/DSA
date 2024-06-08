class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with cumulative sum 0 at index -1
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
                sum %= k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true; // Subarray found with sum as multiple of k
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
}

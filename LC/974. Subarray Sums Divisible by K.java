import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            int mod = ((sum % k) + k) % k;
            if (prefixSums.containsKey(mod)) {
                count += prefixSums.get(mod);
            }
            prefixSums.put(mod, prefixSums.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}

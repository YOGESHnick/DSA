class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // 1. store frequency of each num in hashmap
        // 2. iterate, if frequency > length/3 add to list
        // 3. return list
        
        // store frequency of each num in hashmap
        Map<Integer, Integer> numberFrequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numberFrequency.put(nums[i], numberFrequency.getOrDefault(nums[i], 0) + 1);
        }
        // iterate, if frequency > length/3 add to list
        List<Integer> majorityElements = new ArrayList<>();
        int threshold = nums.length / 3;
        
        for (Map.Entry<Integer, Integer> entry : numberFrequency.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > threshold) {
                majorityElements.add(element);
            }
        }
        return majorityElements;
    }
}

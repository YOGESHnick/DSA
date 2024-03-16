class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> bucket = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        sub(nums,0);
        return answer;
    }
    public void sub(int[] nums, int index) {
        answer.add(new ArrayList<>(bucket));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            bucket.add(nums[i]);
            sub(nums, i + 1);
            bucket.remove(bucket.size() - 1);
        }
    }
}

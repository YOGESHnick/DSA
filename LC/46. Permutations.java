class Solution {

    public void possibilities(int[] nums,List<List<Integer>> answer,List<Integer> bucket,boolean[] takenArray){
        if(bucket.size()==nums.length){
            answer.add(new ArrayList<>(bucket));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!takenArray[i]){
                takenArray[i]=true;
                bucket.add(nums[i]);
                possibilities(nums,answer,bucket,takenArray);
                bucket.remove(bucket.size()-1);
                takenArray[i]=false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> bucket = new ArrayList<>();
        boolean[] takenArray = new boolean[nums.length];
        possibilities(nums,answer,bucket,takenArray);
        return answer;
    }
}
//  approach 2 --> reduces space complexity

class Solution {
    public void possibilities(int[] nums, List<List<Integer>> answer, int start) {
        if (start == nums.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            answer.add(permutation);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            possibilities(nums, answer, start + 1);
            swap(nums, start, i);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        possibilities(nums, answer, 0);
        return answer;
    }
}

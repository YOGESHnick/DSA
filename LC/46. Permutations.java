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

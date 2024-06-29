class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        //count refers to the number of occureneces where i>i+1 (not sorted)
        //if count<=1 array is rotated else it is not sorted, 
        // as only one time in rotated array we get the occurence of i>i+1
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        if(nums[0] < nums[nums.length-1]){
            count++;
        }
        return count <= 1;
    }
}

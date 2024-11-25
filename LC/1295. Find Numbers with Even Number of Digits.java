class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int numOfDigits=0;
            // while(nums[i]!=0){
            //     nums[i]=nums[i]/10;
            //     numOfDigits++;
            // }
            if( (int)(Math.log10(nums[i])+1)  %2==0 )
            // if(numOfDigits%2==0)
                count++;
        }
        return count;
    }
}

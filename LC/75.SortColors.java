class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if ( nums[i] == 0) cnt0++;
            else if (nums[i] == 1) cnt1++;
            else cnt2++;
        }

        for (int i = 0; i < cnt0; i++) nums[i]=0; // replacing 0's
        for (int i = cnt0; i < cnt0 + cnt1; i++) nums[i]=1; // replacing 1's
        for (int i = cnt0 + cnt1; i < n; i++) nums[i]=2;
    }
}

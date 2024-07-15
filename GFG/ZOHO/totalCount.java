class Solution {
    int totalCount(int[] arr, int n, int k) {
        int count=0;
        for(int num:arr){
            count+=num/k;
            if(num%k!=0){
                count++;
            }
        }
        return count;
    }
}

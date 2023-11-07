import java.util.Arrays;
public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        int[] hash = new int[x+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]=hash[nums[i]]+1;
        }
        return Arrays.copyOfRange(hash, 1, n+1);
    }
}

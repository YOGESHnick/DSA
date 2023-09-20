public class Solution {
    public static int getSingleElement(int []arr){
        int n = arr.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}

// Assume the given array is: [4,1,2,1,2]
// XOR of all elements = 4^1^2^1^2
//       = 4 ^ (1^1) ^ (2^2)
//       = 4 ^ 0 ^ 0 = 4^0 = 4
// Hence, 4 is the single element in the array.
// XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
// XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2

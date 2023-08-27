import java.util.* ;
import java.io.*; 
public class Solution {
    static int findfloor(int[]arr,int l,int h,int x,int ans)
    {
        if(l>h) 
          return ans;
        int mid=(l+h)/2;
        if(arr[mid]<=x)
        {
            ans=arr[mid];
            return findfloor(arr,mid+1,h,x,ans);
        }
        else
         return findfloor(arr, l, mid-1, x, ans);
    }
    static int findceil(int[] arr,int l,int h,int x,int ans)
    {
        if(l>h)
         return ans;
        int mid=(l+h)/2;
        if(arr[mid]>=x)
        {
            ans=arr[mid];
            return findceil(arr,l,mid-1,x,ans);
        }
        else
         return findceil(arr, mid+1, h, x, ans);
    }
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
           Arrays.sort(arr);
          System.out.print(findfloor(arr,0,n-1,x,-1)+" ");
          int a=findceil(arr,0,n-1,x,-1);
           return a;
    }
}  

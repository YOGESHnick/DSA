public class Solution {
    public static void selectionSort(int[] arr) {
        int len=arr.length;
        int min=0;
        for(int i=0;i<=len-2;i++)
        {
            min=i;
            for(int j=i;j<=len-1;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

}

public class Solution {
   public static int[] alternateNumbers(int []a) {
       int b[]=new int[a.length];
       int j=0;
       int k=0;
       for(int i=0;i<a.length;i++){
            if(a[i]>0){
                b[j]=a[i];
                j=j+2;
            }
            else if(a[i]<0){
                b[k+1]=a[i];
                k=k+2;
            }
        }
        return b;
   }
}

import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        int a[]=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<v.length;i++)
        {
            if(h.containsKey(v[i])){
                h.put(v[i],h.get(v[i])+1);
            }
            else{
                h.put(v[i],1);
            }
        }
       int max=0,min=v.length;
       for(Map.Entry<Integer,Integer> ans : h.entrySet())
       {
           int count=ans.getValue();
           int ele=ans.getKey();
           if(count>max ) {
               a[0]=ele;
               max=count;
           }
           else if(count==max) {
               if(ele<a[0])
               {
                   a[0]=ele;
               }
           }
            if(count<min){
               a[1]=ele;
               min=count;
           }
           else if(count==min) {
               if(ele<a[1])
               {
                   a[1]=ele;
               }
           }
       }
        return a;
    }
}

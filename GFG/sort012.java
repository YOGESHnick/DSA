class Solution
{
    public static void sort012(int a[], int n)
    {
        int z=0;int o=0;int t=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
            z++;
            else if(a[i]==1)
            o++;
            else
            t++;
        }
        int index=0;
        // System.out.print(z+ " "+ o +" "+ t);
        // for(int i=0;i<z;i++){
        //     a[index]=0;
        //     index++;
        // }
        // for(int i=0;i<o;i++){
        //     a[index]=1;
        //     index++;
        // }
        // for(int i=0;i<t;i++){
        //     a[index]=2;
        //     index++;
        // }
        while(index<=n){
            if(z!=0){
                a[index]=0;
                z--;
            }
            else if(o!=0){
                a[index]=1;
                o--;
            }
            else if(t!=0){
                a[index]=2;
                t--;
            }
            index++;
        }
        
    }
}

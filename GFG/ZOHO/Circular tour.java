class Solution
{
    int tour(int petrol[], int distance[])
    {
        int start=0;
        int deficit=0;
        int petrolLeft=0;
        for(int i=0;i<petrol.length;i++){
            petrolLeft += petrol[i]-distance[i];
            if(petrolLeft<0){
                start = i+1;
                deficit += petrolLeft;
                petrolLeft=0;
            }
        }
        return (petrolLeft+deficit >=0? start:-1);
    }
}

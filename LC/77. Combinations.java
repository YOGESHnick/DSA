class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        List<List<Integer>> al=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> m=subsequence(a,k,0,al,l);
        return m;
    }
    public List<List<Integer>> subsequence(int[] a,int k,int idx,List<List<Integer>> al,List<Integer> l){
        if(idx==a.length){
            if(l.size() == k){
                al.add(new ArrayList<>(l));
            }
            return al;
        }
        l.add(a[idx]);
        subsequence(a,k,idx+1,al,l);
        l.remove(l.size()-1);
        subsequence(a,k,idx+1,al,l);
        return al;
    }
}

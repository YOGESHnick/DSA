class Solution {
    public static void findThePath(int i,int j,int [][]grid,ArrayList<String>ans,
    String s,int n,int m,boolean[][]vis){
        if(i<0 || i==n || j<0 || j==m || grid[i][j]==0 || vis[i][j]==true){
            return;
        }
        if(i==n-1 && j==m-1 && grid[i][j]==1 && vis[i][j]==false){
            ans.add(s);
            return;
        }
        
        if(vis[i][j]==false){
            vis[i][j]=true;
            findThePath(i+1,j,grid,ans,s+'D',n,m,vis);
            findThePath(i,j-1,grid,ans,s+'L',n,m,vis);
            findThePath(i,j+1,grid,ans,s+'R',n,m,vis);
            findThePath(i-1,j,grid,ans,s+'U',n,m,vis);
            vis[i][j]=false;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        if(m[0][0]==0)return new ArrayList<>();
        boolean vis[][]=new boolean[n][n];
        ArrayList<String>ans = new ArrayList<>();
        findThePath(0,0,m,ans,"",n,n,vis);
        
        return ans;
    }
}

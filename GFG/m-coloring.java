class solve {
    public boolean graphColoring(boolean graph[][], int m, int n) {
        int[] colurs = new int[n];
        return solve(graph, colurs, 0, m);
    }
    boolean solve(boolean graph[][], int[] colurs, int node, int m) {
        if (node == graph.length)
                return true;
        for (int i = 1; i <= m; i++) {
            if (isColourable(graph, colurs, node, i)) 
            {
                colurs[node] = i;
                if (solve(graph, colurs, node + 1, m)) return true;
                else colurs[node] = 0;
            }
        }
        return false;
    }
    boolean isColourable(boolean graph[][], int[] colurs, int node, int color){
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == true && colurs[i] == color)
            {
                return false;
            }
        }
        return true;
    }
}

class GFG {
    static void rotate(int matrix[][]) {
        int n = matrix.length;

        // Transpose 
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse nga
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
    }
}

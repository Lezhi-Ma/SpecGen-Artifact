public class TransposeMatrix {
    //@ requires 0 < matrix.length && matrix.length <= Integer.MAX_VALUE;
    //@ requires 0 < matrix[0].length && matrix[0].length <= Integer.MAX_VALUE;
    //@ requires (\forall int k; 0 <= k && k < matrix.length; matrix[k] != null);
    //@ requires (\forall int k; 0 <= k && k < matrix.length; matrix[0].length == matrix[k].length);
    //@ ensures (\forall int i; 0<= i && i < matrix[0].length; (\forall int j; 0 <= j && j < matrix.length ; \result[i][j] == matrix[j][i]));
    //@ ensures matrix.length == \result[0].length;
    //@ ensures matrix[0].length == \result.length; 
    public int[][] transposeMat(int[][] matrix)
    {
       int m, n, p, q;
       m = matrix.length;
       n = matrix[0].length;
       int[][] transpose = new int[n][m];

       //@ assume \forall int i; 0 <= i && i < n; transpose[i] != null && transpose[i].length == m;
       //@ assume \forall int e; 0 <= e && e < n; \forall int k; 0 <= k && k < n; (e != k ==> transpose[e] != transpose[k]);
       //@ assume \forall int e; 0<= e && e < n; (\forall int k; 0 <= k && k < m; transpose[e] != matrix[k]);

       //@ maintaining 0 <= c && c <= n;
       //@ maintaining \forall int i; 0 <= i && i < c; (\forall int j; 0 <= j && j < m ; transpose[i][j] == matrix[j][i]);
       //@ decreases n - c;
       for (int c = 0; c < n; c++) {
           //@ maintaining 0 <= d && d <= m;
           //@ maintaining (\forall int j; 0 <= j && j < d; transpose[c][j] == matrix[j][c]);
           //@ decreases m - d;
           for (int d = 0; d < m; d++) {
               transpose[c][d] = matrix[d][c];
           }
       }
       return transpose;
    }
}


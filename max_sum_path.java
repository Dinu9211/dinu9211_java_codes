public class max_sum_path {

    public static int maxpath(int i, int j, int mat[][]) {
        if (j == mat[0].length - 1 && i == mat.length - 1) {
            t[i][j] = mat[i][j];
            return t[i][j];

        }
        
        if (j == mat[0].length)
            return 0; // column
        if (i == mat.length)
            return 0; // row
        if (t[i][j] != 0)
            return t[i][j];
        int R = maxpath(i, j + 1, mat) + mat[i][j];
        int D = maxpath(i + 1, j, mat) + mat[i][j];
         t[i][j] = Math.max(R, D);
        return t[i][j];

        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[0].length; j++) {
                System.out.print(t[i][j]);
            }
        }sys.out.println();

    }

    public static void main(String[] args) {
        int a[][] = new int[][] {
                { 1, 3, 5, 6, 8, },
                { 2, 7, 9, 1, 3, },
                { 9, 0, 3, 2, 7, },
                { 6, 5, 4, 3, 1, },
                { 9, 8, 6, 0, 5, }};

    }


    maxpath(a);
}

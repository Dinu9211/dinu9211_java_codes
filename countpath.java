public class countpath {
    public static long[][] temp = new long[4][4];

    public static long paths(int i, int j, char[][] m) {
        if (j == m[0].length - 1 && i == m.length - 1) {
            temp[i][j] = 0;
            return temp[i][j] + 1;
        }
        
        if (j == m[0].length)
        return 0; // column
        if (i == m.length)
        return 0; // row

        if (temp[i][j] != 0)
        return temp[i][j];

        long r = paths(i, j + 1, m); // right
        long d = paths(i + 1, j, m); // down
        temp[i][j] = r + d;
        return temp[i][j];
    }

    public static void main(String[] args) {
        char[][] mat = new char[4][4]; 

        long totalPaths = paths(0, 0, mat);
        System.out.println("total paths = " + totalPaths);

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}

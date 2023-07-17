import java.util.regex.Matcher;

class rowcol{
    private int row;
    public int col;
    rowcol(int r, int c) {
        this.row = r;
        this.col = c;

    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }


}
public class zero_matrix {
    public static void print_matrix(int m[][]){
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[0].length; j++) {
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = new int[][] { { 1,3,5,6,8,9},
                                    { 2,7,9,1,3,1},
                                    { 9,0,3,2,7,8},
                                    { 6,5,4,3,1,2},
                                    { 9,8,6,0,5,8},
                                    { 8,1,3,7,6,9} };
              
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (mat[i][j] == 0)
                count++;
            }

        }
        System.out.println("Original Matrix is: ");
        print_matrix(mat);

        rowcol arr[] =  new rowcol[count];

        int index=0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++)
            if(mat[i][j]==0){
                arr[index] = new rowcol(i,j);
                index++;
            }

        }
        System.out.println("After Operation: ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                mat[arr[i].getRow()][j] = 0;
            }
            for (int k = 0; k < mat.length; k++){
                mat[k][arr[i].col] = 0;
            }
        }
        print_matrix(mat);

    }

}

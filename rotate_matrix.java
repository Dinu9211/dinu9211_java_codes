import java.util.*;

public class rotate_matrix {

    public static void output(int b[][]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    
    }

    public static void rotate(int c[][]){
        for(int i = 0; i<c.length/2; i++) {
            for(int j = i; j<c.length-i-1; j++) {
                int temp = c[i][j];
                c[i][j] = c[c.length-j-1][i];
                c[c.length-j-1][i] = c[c.length-i-1][c.length-j-1];
                c[c.length-i-1][c.length-j-1] = c[j][c.length-i-1];
                c[j][c.length-i-1] = temp;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter no. of row and columan: ");
                int num = sc.nextInt();
                int[][] a = new int[num][num];
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[0].length; j++) {
                        a[i][j] = (i + j + 1) % 10;

                    }
                }
                output(a);
                rotate(a);
                System.out.println("\nrotated mat - ");
                output(a);
    }
}
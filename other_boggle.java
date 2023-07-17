import java.util.*;

public class other_boggle {

    public static boolean boggle_search(char a[][], String s, int i, int j, int index, char f) {
        System.out.println("i - " + i + " j - " + j + " - " + s.charAt(index) + " - " + f);
        if (f != 'U' && i - 1 >= 0 && a[i - 1][j] == s.charAt(index)) { // up
            if (s.length() - 1 == index)
                return true;
            a[i - 1][j] = '$';
            return boggle_search(a, s, i - 1, j, index + 1, 'D');
        } else if (f != 'D' && i + 1 < a.length && a[i + 1][j] == s.charAt(index)) { // down
            if (s.length() - 1 == index)
                return true;
            a[i + 1][j] = '$';
            return boggle_search(a, s, i + 1, j, index + 1, 'U');
        } else if (f != 'R' && j + 1 < a[0].length && a[i][j + 1] == s.charAt(index)) { // right
            if (s.length() - 1 == index)
                return true;
            a[i][j + 1] = '$';
            return boggle_search(a, s, i, j + 1, index + 1, 'L');
        } else if (f != 'L' && j - 1 >= 0 && a[i][j - 1] == s.charAt(index)) { // left
            if (s.length() - 1 == index)
                return true;
            a[i][j - 1] = '$';
            return boggle_search(a, s, i, j - 1, index + 1, 'R');
        } else {
            System.out.println("not found - " + s.charAt(index));
            return false;
        }

    }

    public static void main(String[] args) {
        char b[][] = new char[][] { { 'A', 'T', 'W', 'I', 'M', 'R' }, 
                                    { 'C', 'B', 'V', 'T', 'U', 'A' },
                                    { 'X', 'Z', 'N', 'E', 'S', 'H' },
                                    { 'Y', 'D', 'I', 'U', 'H', 'S' }, 
                                    { 'H', 'E', 'L', 'L', 'O', 'H' }, 
                                    { 'M', 'A', 'R', 'O', 'M', 'Q' } };
        String s = "SHSHS";

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        boolean f = true;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == s.charAt(0)) {
                    b[i][j] = '$';
                    if (boggle_search(b, s, i, j, 1, 'M')) {
                        f = false;
                        System.out.println("yes string is present");
                    }
                }
            }
        }
        if (f)
            System.out.println("String not found");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
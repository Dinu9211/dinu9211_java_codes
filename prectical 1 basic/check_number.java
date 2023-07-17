import java.util.*;

public class check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter any number: ");
            int a = sc.nextInt();

            if (a > 0) {
                System.out.println("Given number is positive: ");
            } else
                System.out.println("Given number is negative: ");
        }

    }
}

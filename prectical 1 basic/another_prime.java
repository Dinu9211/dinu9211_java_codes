import java.util.*;

public class another_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();

        int i, j;
        if (a == 0 || a == 1 || b == 1)
            System.out.println("Please not enter 0 and 1 numbre try to another number: ");

        for (j = a; j <= b; j++) {
            int flag = 0;
            for (i = 2; i <= j; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                System.out.println(j);

        }
    }
}

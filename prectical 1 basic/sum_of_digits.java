import java.util.*;

public class sum_of_digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digits of number for sum: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int m = num%10;
            sum = sum + m;
            num = num/10;

        }
        System.out.println("The sum of given digits is: "+sum);

    }
}

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter a number to check Palindrome: ");
            int a = sc.nextInt();
            int original = a;
            int reverse = 0, reminder;
            while (a != 0) {

                reminder = a % 10;
                reverse = (reverse * 10) + reminder;
                a /= 10;
            }
            if (original == reverse) {
                System.out.println("Given no. is Palindrome");
            }
            else 
            System.out.println("Given no. is not Palindrome");

        }

    }

}

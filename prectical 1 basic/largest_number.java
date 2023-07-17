import java.util.*;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 number to find largest number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp;

        if (a > b && a > c)
            System.out.println(a + " is largest number ");

        else if (b > a && b > c)
            System.out.println(b + " is largest number ");

        else 

            System.out.println(c + " is largest nummber ");

    }

}

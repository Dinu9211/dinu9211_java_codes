import java.util.*;

public class mean_median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter any 5 number to find mean and median: ");
            int a[] = new int[5];
            int b = a.length,sum = 0;

            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }
            System.out.println("Mean is: "+sum/5);
        
            double median=0;
            if (b%2==1){
                median = a[(b+1)/2-1];

            }
            else{
                median = (a[b/2-1]+a[b/2])/2;

            }
            System.out.println("Median is: "+median);
        }

    }

}

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        int i, flag = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value - ");
        n = sc.nextInt();
        sc.close();
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");

            }
        } // end of else
    }

}
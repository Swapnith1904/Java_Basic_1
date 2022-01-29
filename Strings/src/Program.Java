import java.util.Scanner;

/* Java Inheritence 
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}
public class Program {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
*/
/*Java Fibonaci 
public class Program {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count;
        // printing 0 and 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        count = sc.nextInt();
        sc.close();
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
*/
/* Java {rogram for Palindrome}
public class Program {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();// It is the number variable to be checked for palindrome
        sc.close();
        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
*/
/*
public class Program {
    public static void main(String[] args) {
        int num, n, temp, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        n = sc.nextInt();
        sc.close();
        num = n;
        while (num != 0) {
            temp = num % 10;
            total = total + (temp * temp * temp);
            num /= 10;
        }
        if (total == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}
*/
/*
public class Program {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Row Size of Pascal Triangle: ");
        int row = s.nextInt();

        for (int i = 0; i < row; i++) {
            for (int space = row; space > i; space--)
                System.out.print(" ");
            num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.print("\n");

        }
    }
}
*/

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }
}
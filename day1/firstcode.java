
// Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.


import java.util.*;

public class firstcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("amount is: " + a);
        System.out.println("Enter a floating point number:");
        float b = sc.nextFloat();
        System.out.println("The weight is: " + b);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("The character is: " + c);

        System.out.println("Enter a string: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("The name is: " + name);

         // Consume the newline character left by next()

        System.out.println("Enter a full name: ");
        String full = sc.nextLine();
        System.out.println("The full name is: " + full);

        System.out.println("Enter a boolean value (true/false): ");
        boolean d = sc.nextBoolean();
        System.out.println("The boolean value is: " + d);
        sc.close();

    }
}
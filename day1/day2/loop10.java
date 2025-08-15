//Reverse a number (e.g., 123 → 321)

import java.util.*;

public class loop10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int num = sc.nextInt();
    int temp = num;
    while(temp > 0)
    {
        int digit = temp % 10;
        System.out.print(digit);
        temp = temp/10;

    }
}
}

//Given number এর digit গুলো আলাদা করে প্রিন্ট করো

import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Reverse count from " + n + " to 1 is:");

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

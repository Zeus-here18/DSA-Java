import java.util.Scanner;

public class NumberSquare {
    public void printSquare(int a) {
        System.out.println("Square: " + (a * a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        NumberSquare obj = new NumberSquare();
        obj.printSquare(num);

        sc.close();
    }
}

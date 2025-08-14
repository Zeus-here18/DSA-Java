// import java.util.Scanner;
// public class printsum {
//     public static void main(String[] args) {
    
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a = sc.nextInt();
//         System.out.println("Enter second number:");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("The sum is: " + sum);
//     }
// }
import java.util.Scanner;
public class printsum {
    public void printNumber(Scanner sc){
        int a = sc.nextInt();
        System.out.println(a);
    

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        printsum ps = new printsum();
        ps.printNumber(sc);
        sc.close();
    }
}
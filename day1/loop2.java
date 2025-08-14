import java.util.Scanner;
public class loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int sum = 1;
         for(int i=1; i<= n; i++){
            sum *= i;
        }
        System.out.println("Factorial of " + n + " is: " + sum);
    }
    
}

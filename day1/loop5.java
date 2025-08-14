import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            
        }
        System.out.print("the sum of 1 to n is: " + sum);
    
}
}

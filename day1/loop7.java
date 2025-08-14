import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <=n; i++){
            if(i%2 != 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers up to " + n + " is: " + sum);
    }
    
}

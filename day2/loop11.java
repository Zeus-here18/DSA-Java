import java.util.Scanner;

public class loop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                if(i % 3 == 0){
                    System.out.println("Odd number divisible by 3 till " + n + " is: " + i);
                }
            }
        }
    }
}

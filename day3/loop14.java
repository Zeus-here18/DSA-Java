import java.util.*;

public class loop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for palindrome: ");
        int num =sc.nextInt();

        int original = num;
        int reverse = 0;
        while(num > 0){
            reverse = reverse * 10 + num % 10;
            num = num/10;
        } if (original == reverse)
        System.out.println("It is a palindrome number");
        else
        System.out.println("it is not a palindrome number");
        
    }
    
}

import java.util.*;

public class loop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        while(num > 0){
            int d = num % 10;
            sum += Math.pow(d,digits);
            num = num/10;
        }
        if(sum == original){
            System.out.println("Armstrong.");
        }else{
            System.out.println("Not Armstrong.");
        }

    }
    
}

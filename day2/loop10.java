import java.util.*;

public class loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int mul = n * i;
            System.out.println(n + "x" + i + "=" + mul);
        }
    }
    
}

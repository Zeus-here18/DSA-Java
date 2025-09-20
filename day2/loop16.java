import java.util.*;

public class loop16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = 1;
        int r = 2;
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            a *= r;
        }

    }
}

import java.util.*;

public class loop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int a = 99;
        int d = 4;
        for(int i=1; i <= n && a > 0; n--){
            System.out.print(a + " ");
            a = a - d;
        }
    }
}

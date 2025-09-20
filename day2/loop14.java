import java.util.*;

public class loop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int a=2 ; 
        int d =3;
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            a = a + d;
        }
    }

}

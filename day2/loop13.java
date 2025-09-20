//Arithmetic progression using formula

import java.util.*;

public class loop13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=2; i <= 3*n-1; i =i+3){
            System.out.println(i);


        }
    }
}

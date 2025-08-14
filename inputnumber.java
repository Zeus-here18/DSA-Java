// 
import java.util.Scanner;
public class inputnumber {
    public void printNumber(Scanner sc){
        int a = sc.nextInt();
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputnumber in = new inputnumber();
        in.printNumber(sc);
        sc.close();
    }
}
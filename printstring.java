//  import java.util.Scanner;
//  public class printstring {
//      public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);
// //         String name = sc.next();
// //         System.out.println("hello " + name + "!" );
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println("hello " + name + "!");
//      }
//  }

    
import java.util.Scanner;
public class printstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(input);
    }
}